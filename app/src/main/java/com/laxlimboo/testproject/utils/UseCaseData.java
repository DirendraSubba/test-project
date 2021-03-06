package com.laxlimboo.testproject.utils;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class UseCaseData implements Serializable {

    Map<String, Object> data = null;

    public UseCaseData() {
        data = new HashMap<>();
    }

    public UseCaseData(String key, Boolean value) {
        data = new HashMap<>();
        putBoolean(key, value);
    }


    public void clearAll() {
        data.clear();
    }

    public void putSerializable(String key, Serializable value) {
        data.put(key, value);
    }

    public Serializable getSerializable(String key) {
        final Object o = data.get(key);
        try {
            return (Serializable) o;
        } catch (ClassCastException e) {
            return null;
        }
    }

    public void putString(String key, String value) {
        data.put(key, value);
    }

    public String getString(String key) {
        final Object o = data.get(key);
        try {
            return (String) o;
        } catch (ClassCastException e) {
            return null;
        }
    }

    public String getString(String key, String defValue) {
        final String s = getString(key);
        return (s == null) ? defValue : s;
    }

    public void putInteger(String key, Integer value) {
        data.put(key, value);
    }

    public Integer getInteger(String key, Integer defValue) {
        final Integer i = getInteger(key);
        return (i == null) ? defValue : i;
    }

    public Integer getInteger(String key) {
        final Object o = data.get(key);
        try {
            return (Integer) o;
        } catch (ClassCastException e) {
            return null;
        }
    }

    public void putBoolean(String key, Boolean value) {
        data.put(key, value);
    }

    public Boolean getBoolean(String key, Boolean defValue) {
        final Boolean i = getBoolean(key);
        return (i == null) ? defValue : i;
    }

    public Boolean getBoolean(String key) {
        final Object o = data.get(key);
        try {
            return (Boolean) o;
        } catch (ClassCastException e) {
            return null;
        }
    }

    public void putDouble(String key, Double value) {
        data.put(key, value);
    }

    public Double getDouble(String key, Double defValue) {
        final Double i = getDouble(key);
        return (i == null) ? defValue : i;
    }

    public Double getDouble(String key) {
        final Object o = data.get(key);
        try {
            return (Double) o;
        } catch (ClassCastException e) {
            return null;
        }
    }

    public void putLong(String key, Long value) {
        data.put(key, value);
    }

    public Long getLong(String key, Long defValue) {
        final Long i = getLong(key);
        return (i == null) ? defValue : i;
    }

    public Long getLong(String key) {
        final Object o = data.get(key);
        try {
            return (Long) o;
        } catch (ClassCastException e) {
            return null;
        }
    }

    @Override
    public String toString() {
        String value = "";
        for (String key : data.keySet()) {
            value += key + " : " + data.get(key) + "\n";
        }
        return value;
    }
}

