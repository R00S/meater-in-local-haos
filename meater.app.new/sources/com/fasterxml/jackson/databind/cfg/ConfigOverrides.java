package com.fasterxml.jackson.databind.cfg;

import java.io.Serializable;
import java.util.Map;

/* loaded from: classes2.dex */
public class ConfigOverrides implements Serializable {
    protected Map<Class<?>, ?> _overrides = null;

    public ConfigOverride findOverride(Class<?> cls) {
        Map<Class<?>, ?> map = this._overrides;
        if (map == null) {
            return null;
        }
        return (ConfigOverride) map.get(cls);
    }
}
