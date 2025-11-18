package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.type.ClassKey;
import java.io.Serializable;
import java.util.Map;

/* loaded from: classes2.dex */
public class SimpleMixInResolver implements ClassIntrospector.MixInResolver, Serializable {
    protected Map<ClassKey, Class<?>> _localMixIns;
    protected final ClassIntrospector.MixInResolver _overrides;

    public SimpleMixInResolver(ClassIntrospector.MixInResolver mixInResolver) {
        this._overrides = mixInResolver;
    }

    @Override // com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver
    public Class<?> findMixInClassFor(Class<?> cls) {
        Map<ClassKey, Class<?>> map;
        ClassIntrospector.MixInResolver mixInResolver = this._overrides;
        Class<?> clsFindMixInClassFor = mixInResolver == null ? null : mixInResolver.findMixInClassFor(cls);
        return (clsFindMixInClassFor != null || (map = this._localMixIns) == null) ? clsFindMixInClassFor : map.get(new ClassKey(cls));
    }
}
