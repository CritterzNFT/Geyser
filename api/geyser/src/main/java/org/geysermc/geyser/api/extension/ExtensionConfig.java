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

package org.geysermc.geyser.api.extension;

import org.checkerframework.checker.nullness.qual.NonNull;

import java.util.List;
import java.util.Map;

/**
 * This is the Geyser extension configuration class.
 */
public interface ExtensionConfig {
    /**
     * Reloads the config
     */
    void reload();

    /**
     * Saves the config
     */
    void save();

    /**
     * Sets a value in the config
     *
     * @param path The path to the value
     * @param value The value to set
     */
    void set(@NonNull String path, @NonNull Object value);

    /**
     * Gets a value from the config
     *
     * @param path The path to the value
     * @return The value as an {@link Object}
     */
    Object get(@NonNull String path);

    /**
     * Gets and integer from the config
     *
     * @param path The path to the value
     * @return The value
     */
    int getInt(@NonNull String path);

    /**
     * Gets if a value is an integer
     *
     * @param path The path to the value
     * @return True if the value is an integer
     */
    boolean isInt(@NonNull String path);

    /**
     * Gets a long from the config
     *
     * @param path The path to the value
     * @return The value
     */
    long getLong(@NonNull String path);

    /**
     * Gets if a value is a long
     *
     * @param path The path to the value
     * @return True if the value is a long
     */
    boolean isLong(@NonNull String path);

    /**
     * Gets a double from the config
     *
     * @param path The path to the value
     * @return The value
     */
    double getDouble(@NonNull String path);

    /**
     * Gets if a value is a double
     *
     * @param path The path to the value
     * @return True if the value is a double
     */
    boolean isDouble(@NonNull String path);

    /**
     * Gets a string from the config
     *
     * @param path The path to the value
     * @return The value
     */
    String getString(@NonNull String path);

    /**
     * Gets if a value is a string
     *
     * @param path The path to the value
     * @return True if the value is a string
     */
    boolean isString(@NonNull String path);

    /**
     * Gets a boolean from the config
     *
     * @param path The path to the value
     * @return The value
     */
    boolean getBoolean(@NonNull String path);

    /**
     * Gets if a value is a boolean
     *
     * @param path The path to the value
     * @return True if the value is a boolean
     */
    boolean isBoolean(@NonNull String path);

    /**
     * Gets a list form the config
     *
     * @param path The path to the value
     * @return The value
     */
    List getList(@NonNull String path);

    /**
     * Gets if a value is a list
     *
     * @param path The path to the value
     * @return True if the value is a list
     */
    boolean isList(@NonNull String path);

    /**
     * Gets a string list from the config
     *
     * @param path The path to the value
     * @return The value
     */
    List<String> getStringList(@NonNull String path);

    /**
     * Gets an integer list from the config
     *
     * @param path The path to the value
     * @return The value
     */
    List<Integer> getIntegerList(@NonNull String path);

    /**
     * Gets a boolean list from the config
     *
     * @param path The path to the value
     * @return The value
     */
    List<Boolean> getBooleanList(@NonNull String path);

    /**
     * Gets a double list from the config
     *
     * @param path The path to the value
     * @return The value
     */
    List<Double> getDoubleList(@NonNull String path);

    /**
     * Gets a float list from the config
     * @param path The path to the value
     * @return The value
     */
    List<Float> getFloatList(@NonNull String path);

    /**
     * Gets a long list from the config
     *
     * @param path The path to the value
     * @return The value
     */
    List<Long> getLongList(@NonNull String path);

    /**
     * Gets a list of bytes from the config
     *
     * @param path The path to the value
     * @return The value
     */
    List<Byte> getByteList(@NonNull String path);

    /**
     * Gets a list of characters from the config
     *
     * @param path The path to the value
     * @return The value
     */
    List<Character> getCharacterList(@NonNull String path);

    /**
     * Gets a list of shorts from the config
     *
     * @param path The path to the value
     * @return The value
     */
    List<Short> getShortList(@NonNull String path);

    /**
     * Gets a list of maps from the config
     *
     * @param path The path to the value
     * @return The value
     */
    List<Map> getMapList(@NonNull String path);

    /**
     * Gets if a config contains a value
     *
     * @param path The path to the value
     * @param ignoreCase If the path should be case sensitive
     * @return True if the config contains the value
     */
    boolean contains(@NonNull String path, boolean ignoreCase);

    /**
     * Gets if a config contains a value
     *
     * @param path The path to the value
     * @return True if the config contains the value
     */
    boolean contains(@NonNull String path);

    /**
     * Removes a value from the config
     *
     * @param path The path to the value
     */
    void remove(@NonNull String path);

    /**
     * Gets all the keys in the config
     *
     * @param deep Should include child keys
     * @return The keys
     */
    List<String> getKeys(boolean deep);

    /**
     * Gets all the keys in the config
     *
     * @return The keys
     */
    List<String> getKeys();
}
