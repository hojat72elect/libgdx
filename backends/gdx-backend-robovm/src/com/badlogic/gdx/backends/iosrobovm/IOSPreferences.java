package com.badlogic.gdx.backends.iosrobovm;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Preferences;
import org.robovm.apple.foundation.*;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class IOSPreferences implements Preferences {
    NSMutableDictionary<NSString, NSObject> nsDictionary;
    File file;

    public IOSPreferences(NSMutableDictionary<NSString, NSObject> nsDictionary, String filePath) {
        this.nsDictionary = nsDictionary;
        this.file = new File(filePath);
    }

    @Override
    public Preferences putBoolean(String key, boolean val) {
        nsDictionary.put(convertKey(key), NSNumber.valueOf(val));
        return this;
    }

    @Override
    public Preferences putInteger(String key, int val) {
        nsDictionary.put(convertKey(key), NSNumber.valueOf(val));
        return this;
    }

    @Override
    public Preferences putLong(String key, long val) {
        nsDictionary.put(convertKey(key), NSNumber.valueOf(val));
        return this;
    }

    @Override
    public Preferences putFloat(String key, float val) {
        nsDictionary.put(convertKey(key), NSNumber.valueOf(val));
        return this;
    }

    @Override
    public Preferences putString(String key, String val) {
        nsDictionary.put(convertKey(key), new NSString(val));
        return this;
    }

    @Override
    public Preferences put(Map<String, ?> vals) {
        Set<String> keySet = vals.keySet();
        for (String key : keySet) {
            Object value = vals.get(key);
            if (value instanceof String) {
                putString(key, (String) value);
            } else if (value instanceof Boolean) {
                putBoolean(key, (Boolean) value);
            } else if (value instanceof Integer) {
                putInteger(key, (Integer) value);
            } else if (value instanceof Long) {
                putLong(key, (Long) value);
            } else if (value instanceof Float) {
                putFloat(key, (Float) value);
            }
        }
        return this;
    }

    @Override
    public boolean getBoolean(String key) {
        NSNumber value = (NSNumber) nsDictionary.get(convertKey(key));
        if (value == null) return false;
        return value.booleanValue();
    }

    @Override
    public int getInteger(String key) {
        NSNumber value = (NSNumber) nsDictionary.get(convertKey(key));
        if (value == null) return 0;
        return value.intValue();
    }

    @Override
    public long getLong(String key) {
        NSNumber value = (NSNumber) nsDictionary.get(convertKey(key));
        if (value == null) return 0L;
        return value.longValue();
    }

    @Override
    public float getFloat(String key) {
        NSNumber value = (NSNumber) nsDictionary.get(convertKey(key));
        if (value == null) return 0f;
        return value.floatValue();
    }

    @Override
    public String getString(String key) {
        NSString value = (NSString) nsDictionary.get(convertKey(key));
        if (value == null) return "";
        return value.toString();
    }

    @Override
    public boolean getBoolean(String key, boolean defValue) {
        if (!contains(key)) return defValue;
        return getBoolean(key);
    }

    @Override
    public int getInteger(String key, int defValue) {
        if (!contains(key)) return defValue;
        return getInteger(key);
    }

    @Override
    public long getLong(String key, long defValue) {
        if (!contains(key)) return defValue;
        return getLong(key);
    }

    @Override
    public float getFloat(String key, float defValue) {
        if (!contains(key)) return defValue;
        return getFloat(key);
    }

    @Override
    public String getString(String key, String defValue) {
        if (!contains(key)) return defValue;
        return getString(key);
    }

    @Override
    public Map<String, ?> get() {
        Map<String, Object> map = new HashMap<String, Object>();
        for (NSString key : nsDictionary.keySet()) {
            NSObject value = nsDictionary.get(key);
            map.put(key.toString(), value.toString());
        }
        return map;
    }

    @Override
    public boolean contains(String key) {
        return nsDictionary.containsKey(convertKey(key));
    }

    @Override
    public void clear() {
        nsDictionary.clear();
    }

    @Override
    public void remove(String key) {
        nsDictionary.remove(convertKey(key));
    }

    private NSString convertKey(String key) {
        return new NSString(key);
    }

    @Override
    public void flush() {
        NSAutoreleasePool pool = new NSAutoreleasePool();
        if (!nsDictionary.write(file, false)) {
            Gdx.app.debug("IOSPreferences", "Failed to write NSDictionary to file " + file);
        }
        pool.close();
    }
}
