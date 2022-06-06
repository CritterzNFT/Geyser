/*
 * Copyright (c) 2019-2022 GeyserMC. http://geysermc.org
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 *
 * @author GeyserMC
 * @link https://github.com/GeyserMC/Geyser
 */

package org.geysermc.geyser.item;

import org.geysermc.geyser.GeyserImpl;
import org.geysermc.geyser.api.item.custom.CustomItemData;
import org.geysermc.geyser.item.mappings.MappingsConfigReader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.function.BiConsumer;

public class GeyserCustomItemManager {
    public static final String CUSTOM_PREFIX = "geyser_custom:";

    public GeyserCustomItemManager() {
        MappingsConfigReader.init(this);
    }

    public void loadMappingsFromJson(BiConsumer<String, CustomItemData> consumer) {
        Path customMappingsDirectory = MappingsConfigReader.getCustomMappingsDirectory();
        if (!Files.exists(customMappingsDirectory)) {
            try {
                Files.createDirectories(customMappingsDirectory);
            } catch (IOException e) {
                GeyserImpl.getInstance().getLogger().error("Failed to create custom mappings directory", e);
                return;
            }
        }

        Path[] mappingsFiles = MappingsConfigReader.getCustomMappingsFiles();
        for (Path mappingsFile : mappingsFiles) {
            MappingsConfigReader.readMappingsFromJson(mappingsFile, consumer);
        }
    }
}
