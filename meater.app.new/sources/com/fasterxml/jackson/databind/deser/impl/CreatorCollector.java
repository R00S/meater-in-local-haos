package com.fasterxml.jackson.databind.deser.impl;

import cm.aptoide.p092pt.BuildConfig;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.std.StdValueInstantiator;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.introspect.AnnotationMap;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes2.dex */
public class CreatorCollector {
    protected static final String[] TYPE_DESCS = {BuildConfig.APTOIDE_THEME, "from-String", "from-int", "from-long", "from-double", "from-boolean", "delegate", "property-based"};
    protected SettableBeanProperty[] _arrayDelegateArgs;
    protected final BeanDescription _beanDesc;
    protected final boolean _canFixAccess;
    protected SettableBeanProperty[] _delegateArgs;
    protected final boolean _forceAccess;
    protected AnnotatedParameter _incompleteParameter;
    protected SettableBeanProperty[] _propertyBasedArgs;
    protected final AnnotatedWithParams[] _creators = new AnnotatedWithParams[9];
    protected int _explicitCreators = 0;
    protected boolean _hasNonDefaultCreator = false;

    protected static final class StdTypeConstructor extends AnnotatedWithParams implements Serializable {
        private final AnnotatedWithParams _base;
        private final int _type;

        public StdTypeConstructor(AnnotatedWithParams annotatedWithParams, int i2) {
            super(annotatedWithParams, null);
            this._base = annotatedWithParams;
            this._type = i2;
        }

        public static AnnotatedWithParams tryToOptimize(AnnotatedWithParams annotatedWithParams) {
            if (annotatedWithParams != null) {
                Class<?> declaringClass = annotatedWithParams.getDeclaringClass();
                if (declaringClass == List.class || declaringClass == ArrayList.class) {
                    return new StdTypeConstructor(annotatedWithParams, 1);
                }
                if (declaringClass == LinkedHashMap.class) {
                    return new StdTypeConstructor(annotatedWithParams, 3);
                }
                if (declaringClass == HashMap.class) {
                    return new StdTypeConstructor(annotatedWithParams, 2);
                }
            }
            return annotatedWithParams;
        }

        protected final Object _construct() {
            int i2 = this._type;
            if (i2 == 1) {
                return new ArrayList();
            }
            if (i2 == 2) {
                return new HashMap();
            }
            if (i2 == 3) {
                return new LinkedHashMap();
            }
            throw new IllegalStateException("Unknown type " + this._type);
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
        public Object call() throws Exception {
            return _construct();
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
        public Object call1(Object obj) throws Exception {
            return _construct();
        }

        @Override // com.fasterxml.jackson.databind.introspect.Annotated
        public boolean equals(Object obj) {
            return obj == this;
        }

        @Override // com.fasterxml.jackson.databind.introspect.Annotated
        public AnnotatedElement getAnnotated() {
            return this._base.getAnnotated();
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
        public Class<?> getDeclaringClass() {
            return this._base.getDeclaringClass();
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
        public Member getMember() {
            return this._base.getMember();
        }

        @Override // com.fasterxml.jackson.databind.introspect.Annotated
        public String getName() {
            return this._base.getName();
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
        public int getParameterCount() {
            return this._base.getParameterCount();
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
        public JavaType getParameterType(int i2) {
            return this._base.getParameterType(i2);
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
        public Class<?> getRawParameterType(int i2) {
            return this._base.getRawParameterType(i2);
        }

        @Override // com.fasterxml.jackson.databind.introspect.Annotated
        public Class<?> getRawType() {
            return this._base.getRawType();
        }

        @Override // com.fasterxml.jackson.databind.introspect.Annotated
        public JavaType getType() {
            return this._base.getType();
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
        public Object getValue(Object obj) throws UnsupportedOperationException, IllegalArgumentException {
            throw new UnsupportedOperationException();
        }

        @Override // com.fasterxml.jackson.databind.introspect.Annotated
        public int hashCode() {
            return this._base.hashCode();
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
        public void setValue(Object obj, Object obj2) throws UnsupportedOperationException, IllegalArgumentException {
            throw new UnsupportedOperationException();
        }

        @Override // com.fasterxml.jackson.databind.introspect.Annotated
        public String toString() {
            return this._base.toString();
        }

        @Override // com.fasterxml.jackson.databind.introspect.Annotated
        public Annotated withAnnotations(AnnotationMap annotationMap) {
            throw new UnsupportedOperationException();
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
        public Object call(Object[] objArr) throws Exception {
            return _construct();
        }
    }

    public CreatorCollector(BeanDescription beanDescription, MapperConfig<?> mapperConfig) {
        this._beanDesc = beanDescription;
        this._canFixAccess = mapperConfig.canOverrideAccessModifiers();
        this._forceAccess = mapperConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS);
    }

    private JavaType _computeDelegateType(AnnotatedWithParams annotatedWithParams, SettableBeanProperty[] settableBeanPropertyArr) {
        if (!this._hasNonDefaultCreator || annotatedWithParams == null) {
            return null;
        }
        int i2 = 0;
        if (settableBeanPropertyArr != null) {
            int length = settableBeanPropertyArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                if (settableBeanPropertyArr[i3] == null) {
                    i2 = i3;
                    break;
                }
                i3++;
            }
        }
        return annotatedWithParams.getParameterType(i2);
    }

    private <T extends AnnotatedMember> T _fixAccess(T t) {
        if (t != null && this._canFixAccess) {
            ClassUtil.checkAndFixAccess((Member) t.getAnnotated(), this._forceAccess);
        }
        return t;
    }

    protected boolean _isEnumValueOf(AnnotatedWithParams annotatedWithParams) {
        return annotatedWithParams.getDeclaringClass().isEnum() && "valueOf".equals(annotatedWithParams.getName());
    }

    public void addBooleanCreator(AnnotatedWithParams annotatedWithParams, boolean z) {
        verifyNonDup(annotatedWithParams, 5, z);
    }

    public void addDelegatingCreator(AnnotatedWithParams annotatedWithParams, boolean z, SettableBeanProperty[] settableBeanPropertyArr) {
        if (annotatedWithParams.getParameterType(0).isCollectionLikeType()) {
            verifyNonDup(annotatedWithParams, 8, z);
            this._arrayDelegateArgs = settableBeanPropertyArr;
        } else {
            verifyNonDup(annotatedWithParams, 6, z);
            this._delegateArgs = settableBeanPropertyArr;
        }
    }

    public void addDoubleCreator(AnnotatedWithParams annotatedWithParams, boolean z) {
        verifyNonDup(annotatedWithParams, 4, z);
    }

    public void addIntCreator(AnnotatedWithParams annotatedWithParams, boolean z) {
        verifyNonDup(annotatedWithParams, 2, z);
    }

    public void addLongCreator(AnnotatedWithParams annotatedWithParams, boolean z) {
        verifyNonDup(annotatedWithParams, 3, z);
    }

    public void addPropertyCreator(AnnotatedWithParams annotatedWithParams, boolean z, SettableBeanProperty[] settableBeanPropertyArr) {
        Integer num;
        verifyNonDup(annotatedWithParams, 7, z);
        if (settableBeanPropertyArr.length > 1) {
            HashMap map = new HashMap();
            int length = settableBeanPropertyArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                String name = settableBeanPropertyArr[i2].getName();
                if ((name.length() != 0 || settableBeanPropertyArr[i2].getInjectableValueId() == null) && (num = (Integer) map.put(name, Integer.valueOf(i2))) != null) {
                    throw new IllegalArgumentException(String.format("Duplicate creator property \"%s\" (index %s vs %d)", name, num, Integer.valueOf(i2)));
                }
            }
        }
        this._propertyBasedArgs = settableBeanPropertyArr;
    }

    public void addStringCreator(AnnotatedWithParams annotatedWithParams, boolean z) {
        verifyNonDup(annotatedWithParams, 1, z);
    }

    public ValueInstantiator constructValueInstantiator(DeserializationConfig deserializationConfig) {
        JavaType javaType_computeDelegateType = _computeDelegateType(this._creators[6], this._delegateArgs);
        JavaType javaType_computeDelegateType2 = _computeDelegateType(this._creators[8], this._arrayDelegateArgs);
        JavaType type = this._beanDesc.getType();
        AnnotatedWithParams annotatedWithParamsTryToOptimize = StdTypeConstructor.tryToOptimize(this._creators[0]);
        StdValueInstantiator stdValueInstantiator = new StdValueInstantiator(deserializationConfig, type);
        AnnotatedWithParams[] annotatedWithParamsArr = this._creators;
        stdValueInstantiator.configureFromObjectSettings(annotatedWithParamsTryToOptimize, annotatedWithParamsArr[6], javaType_computeDelegateType, this._delegateArgs, annotatedWithParamsArr[7], this._propertyBasedArgs);
        stdValueInstantiator.configureFromArraySettings(this._creators[8], javaType_computeDelegateType2, this._arrayDelegateArgs);
        stdValueInstantiator.configureFromStringCreator(this._creators[1]);
        stdValueInstantiator.configureFromIntCreator(this._creators[2]);
        stdValueInstantiator.configureFromLongCreator(this._creators[3]);
        stdValueInstantiator.configureFromDoubleCreator(this._creators[4]);
        stdValueInstantiator.configureFromBooleanCreator(this._creators[5]);
        stdValueInstantiator.configureIncompleteParameter(this._incompleteParameter);
        return stdValueInstantiator;
    }

    public boolean hasDefaultCreator() {
        return this._creators[0] != null;
    }

    public boolean hasDelegatingCreator() {
        return this._creators[6] != null;
    }

    public boolean hasPropertyBasedCreator() {
        return this._creators[7] != null;
    }

    public void setDefaultCreator(AnnotatedWithParams annotatedWithParams) {
        this._creators[0] = (AnnotatedWithParams) _fixAccess(annotatedWithParams);
    }

    protected void verifyNonDup(AnnotatedWithParams annotatedWithParams, int i2, boolean z) {
        boolean z2;
        int i3 = 1 << i2;
        this._hasNonDefaultCreator = true;
        AnnotatedWithParams annotatedWithParams2 = this._creators[i2];
        if (annotatedWithParams2 != null) {
            if ((this._explicitCreators & i3) == 0) {
                z2 = !z;
            } else if (!z) {
                return;
            } else {
                z2 = true;
            }
            if (z2 && annotatedWithParams2.getClass() == annotatedWithParams.getClass()) {
                Class<?> rawParameterType = annotatedWithParams2.getRawParameterType(0);
                Class<?> rawParameterType2 = annotatedWithParams.getRawParameterType(0);
                if (rawParameterType == rawParameterType2) {
                    if (_isEnumValueOf(annotatedWithParams)) {
                        return;
                    }
                    if (!_isEnumValueOf(annotatedWithParams2)) {
                        Object[] objArr = new Object[4];
                        objArr[0] = TYPE_DESCS[i2];
                        objArr[1] = z ? "explicitly marked" : "implicitly discovered";
                        objArr[2] = annotatedWithParams2;
                        objArr[3] = annotatedWithParams;
                        throw new IllegalArgumentException(String.format("Conflicting %s creators: already had %s creator %s, encountered another: %s", objArr));
                    }
                } else if (rawParameterType2.isAssignableFrom(rawParameterType)) {
                    return;
                }
            }
        }
        if (z) {
            this._explicitCreators |= i3;
        }
        this._creators[i2] = (AnnotatedWithParams) _fixAccess(annotatedWithParams);
    }
}
