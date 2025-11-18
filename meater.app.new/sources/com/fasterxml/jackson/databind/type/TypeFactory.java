package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.LRUMap;
import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class TypeFactory implements Serializable {
    private static final Class<?> CLS_BOOL;
    private static final Class<?> CLS_INT;
    private static final Class<?> CLS_LONG;
    protected static final SimpleType CORE_TYPE_BOOL;
    protected static final SimpleType CORE_TYPE_CLASS;
    protected static final SimpleType CORE_TYPE_COMPARABLE;
    protected static final SimpleType CORE_TYPE_ENUM;
    protected static final SimpleType CORE_TYPE_INT;
    protected static final SimpleType CORE_TYPE_LONG;
    protected static final SimpleType CORE_TYPE_OBJECT;
    protected static final SimpleType CORE_TYPE_STRING;
    protected final ClassLoader _classLoader;
    protected final TypeModifier[] _modifiers;
    protected final TypeParser _parser;
    protected final LRUMap<Object, JavaType> _typeCache;
    private static final JavaType[] NO_TYPES = new JavaType[0];
    protected static final TypeFactory instance = new TypeFactory();
    protected static final TypeBindings EMPTY_BINDINGS = TypeBindings.emptyBindings();
    private static final Class<?> CLS_STRING = String.class;
    private static final Class<?> CLS_OBJECT = Object.class;
    private static final Class<?> CLS_COMPARABLE = Comparable.class;
    private static final Class<?> CLS_CLASS = Class.class;
    private static final Class<?> CLS_ENUM = Enum.class;

    static {
        Class<?> cls = Boolean.TYPE;
        CLS_BOOL = cls;
        Class<?> cls2 = Integer.TYPE;
        CLS_INT = cls2;
        Class<?> cls3 = Long.TYPE;
        CLS_LONG = cls3;
        CORE_TYPE_BOOL = new SimpleType(cls);
        CORE_TYPE_INT = new SimpleType(cls2);
        CORE_TYPE_LONG = new SimpleType(cls3);
        CORE_TYPE_STRING = new SimpleType(String.class);
        CORE_TYPE_OBJECT = new SimpleType(Object.class);
        CORE_TYPE_COMPARABLE = new SimpleType(Comparable.class);
        CORE_TYPE_ENUM = new SimpleType(Enum.class);
        CORE_TYPE_CLASS = new SimpleType(Class.class);
    }

    private TypeFactory() {
        this(null);
    }

    private TypeBindings _bindingsForSubtype(JavaType javaType, int i2, Class<?> cls) {
        int iContainedTypeCount = javaType.containedTypeCount();
        if (iContainedTypeCount != i2) {
            return TypeBindings.emptyBindings();
        }
        if (i2 == 1) {
            return TypeBindings.create(cls, javaType.containedType(0));
        }
        if (i2 == 2) {
            return TypeBindings.create(cls, javaType.containedType(0), javaType.containedType(1));
        }
        ArrayList arrayList = new ArrayList(iContainedTypeCount);
        for (int i3 = 0; i3 < iContainedTypeCount; i3++) {
            arrayList.add(javaType.containedType(i3));
        }
        return TypeBindings.create(cls, arrayList);
    }

    private JavaType _collectionType(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        JavaType javaType_unknownType;
        List<JavaType> typeParameters = typeBindings.getTypeParameters();
        if (typeParameters.isEmpty()) {
            javaType_unknownType = _unknownType();
        } else {
            if (typeParameters.size() != 1) {
                throw new IllegalArgumentException("Strange Collection type " + cls.getName() + ": can not determine type parameters");
            }
            javaType_unknownType = typeParameters.get(0);
        }
        return CollectionType.construct(cls, typeBindings, javaType, javaTypeArr, javaType_unknownType);
    }

    private JavaType _mapType(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        JavaType javaType_unknownType;
        JavaType javaType2;
        JavaType javaType3;
        if (cls == Properties.class) {
            javaType_unknownType = CORE_TYPE_STRING;
        } else {
            List<JavaType> typeParameters = typeBindings.getTypeParameters();
            int size = typeParameters.size();
            if (size != 0) {
                if (size == 2) {
                    JavaType javaType4 = typeParameters.get(0);
                    javaType2 = typeParameters.get(1);
                    javaType3 = javaType4;
                    return MapType.construct(cls, typeBindings, javaType, javaTypeArr, javaType3, javaType2);
                }
                throw new IllegalArgumentException("Strange Map type " + cls.getName() + ": can not determine type parameters");
            }
            javaType_unknownType = _unknownType();
        }
        javaType3 = javaType_unknownType;
        javaType2 = javaType3;
        return MapType.construct(cls, typeBindings, javaType, javaTypeArr, javaType3, javaType2);
    }

    private JavaType _referenceType(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        JavaType javaType_unknownType;
        List<JavaType> typeParameters = typeBindings.getTypeParameters();
        if (typeParameters.isEmpty()) {
            javaType_unknownType = _unknownType();
        } else {
            if (typeParameters.size() != 1) {
                throw new IllegalArgumentException("Strange Reference type " + cls.getName() + ": can not determine type parameters");
            }
            javaType_unknownType = typeParameters.get(0);
        }
        return ReferenceType.construct(cls, typeBindings, javaType, javaTypeArr, javaType_unknownType);
    }

    public static TypeFactory defaultInstance() {
        return instance;
    }

    public static JavaType unknownType() {
        return defaultInstance()._unknownType();
    }

    protected JavaType _constructSimple(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        JavaType javaType_findWellKnownSimple;
        return (!typeBindings.isEmpty() || (javaType_findWellKnownSimple = _findWellKnownSimple(cls)) == null) ? _newSimpleType(cls, typeBindings, javaType, javaTypeArr) : javaType_findWellKnownSimple;
    }

    protected Class<?> _findPrimitive(String str) {
        if ("int".equals(str)) {
            return Integer.TYPE;
        }
        if ("long".equals(str)) {
            return Long.TYPE;
        }
        if ("float".equals(str)) {
            return Float.TYPE;
        }
        if ("double".equals(str)) {
            return Double.TYPE;
        }
        if ("boolean".equals(str)) {
            return Boolean.TYPE;
        }
        if ("byte".equals(str)) {
            return Byte.TYPE;
        }
        if ("char".equals(str)) {
            return Character.TYPE;
        }
        if ("short".equals(str)) {
            return Short.TYPE;
        }
        if ("void".equals(str)) {
            return Void.TYPE;
        }
        return null;
    }

    protected JavaType _findWellKnownSimple(Class<?> cls) {
        if (!cls.isPrimitive()) {
            if (cls == CLS_STRING) {
                return CORE_TYPE_STRING;
            }
            if (cls == CLS_OBJECT) {
                return CORE_TYPE_OBJECT;
            }
            return null;
        }
        if (cls == CLS_BOOL) {
            return CORE_TYPE_BOOL;
        }
        if (cls == CLS_INT) {
            return CORE_TYPE_INT;
        }
        if (cls == CLS_LONG) {
            return CORE_TYPE_LONG;
        }
        return null;
    }

    protected JavaType _fromAny(ClassStack classStack, Type type, TypeBindings typeBindings) {
        JavaType javaType_fromWildcard;
        if (type instanceof Class) {
            javaType_fromWildcard = _fromClass(classStack, (Class) type, EMPTY_BINDINGS);
        } else if (type instanceof ParameterizedType) {
            javaType_fromWildcard = _fromParamType(classStack, (ParameterizedType) type, typeBindings);
        } else {
            if (type instanceof JavaType) {
                return (JavaType) type;
            }
            if (type instanceof GenericArrayType) {
                javaType_fromWildcard = _fromArrayType(classStack, (GenericArrayType) type, typeBindings);
            } else if (type instanceof TypeVariable) {
                javaType_fromWildcard = _fromVariable(classStack, (TypeVariable) type, typeBindings);
            } else {
                if (!(type instanceof WildcardType)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unrecognized Type: ");
                    sb.append(type == null ? "[null]" : type.toString());
                    throw new IllegalArgumentException(sb.toString());
                }
                javaType_fromWildcard = _fromWildcard(classStack, (WildcardType) type, typeBindings);
            }
        }
        if (this._modifiers != null) {
            javaType_fromWildcard.getBindings();
            TypeModifier[] typeModifierArr = this._modifiers;
            if (typeModifierArr.length > 0) {
                TypeModifier typeModifier = typeModifierArr[0];
                throw null;
            }
        }
        return javaType_fromWildcard;
    }

    protected JavaType _fromArrayType(ClassStack classStack, GenericArrayType genericArrayType, TypeBindings typeBindings) {
        return ArrayType.construct(_fromAny(classStack, genericArrayType.getGenericComponentType(), typeBindings), typeBindings);
    }

    protected JavaType _fromClass(ClassStack classStack, Class<?> cls, TypeBindings typeBindings) {
        ClassStack classStackChild;
        JavaType javaType_resolveSuperClass;
        JavaType[] javaTypeArr_resolveSuperInterfaces;
        JavaType javaType_newSimpleType;
        JavaType javaType_findWellKnownSimple = _findWellKnownSimple(cls);
        if (javaType_findWellKnownSimple != null) {
            return javaType_findWellKnownSimple;
        }
        Object objAsKey = (typeBindings == null || typeBindings.isEmpty()) ? cls : typeBindings.asKey(cls);
        JavaType javaTypeRefine = this._typeCache.get(objAsKey);
        if (javaTypeRefine != null) {
            return javaTypeRefine;
        }
        if (classStack == null) {
            classStackChild = new ClassStack(cls);
        } else {
            ClassStack classStackFind = classStack.find(cls);
            if (classStackFind != null) {
                ResolvedRecursiveType resolvedRecursiveType = new ResolvedRecursiveType(cls, EMPTY_BINDINGS);
                classStackFind.addSelfReference(resolvedRecursiveType);
                return resolvedRecursiveType;
            }
            classStackChild = classStack.child(cls);
        }
        if (cls.isArray()) {
            javaType_newSimpleType = ArrayType.construct(_fromAny(classStackChild, cls.getComponentType(), typeBindings), typeBindings);
        } else {
            if (cls.isInterface()) {
                javaType_resolveSuperClass = null;
                javaTypeArr_resolveSuperInterfaces = _resolveSuperInterfaces(classStackChild, cls, typeBindings);
            } else {
                javaType_resolveSuperClass = _resolveSuperClass(classStackChild, cls, typeBindings);
                javaTypeArr_resolveSuperInterfaces = _resolveSuperInterfaces(classStackChild, cls, typeBindings);
            }
            JavaType javaType = javaType_resolveSuperClass;
            JavaType[] javaTypeArr = javaTypeArr_resolveSuperInterfaces;
            if (cls == Properties.class) {
                SimpleType simpleType = CORE_TYPE_STRING;
                javaTypeRefine = MapType.construct(cls, typeBindings, javaType, javaTypeArr, simpleType, simpleType);
            } else if (javaType != null) {
                javaTypeRefine = javaType.refine(cls, typeBindings, javaType, javaTypeArr);
            }
            javaType_newSimpleType = (javaTypeRefine == null && (javaTypeRefine = _fromWellKnownClass(classStackChild, cls, typeBindings, javaType, javaTypeArr)) == null && (javaTypeRefine = _fromWellKnownInterface(classStackChild, cls, typeBindings, javaType, javaTypeArr)) == null) ? _newSimpleType(cls, typeBindings, javaType, javaTypeArr) : javaTypeRefine;
        }
        classStackChild.resolveSelfReferences(javaType_newSimpleType);
        if (!javaType_newSimpleType.hasHandlers()) {
            this._typeCache.putIfAbsent(objAsKey, javaType_newSimpleType);
        }
        return javaType_newSimpleType;
    }

    protected JavaType _fromParamType(ClassStack classStack, ParameterizedType parameterizedType, TypeBindings typeBindings) {
        TypeBindings typeBindingsCreate;
        Class<?> cls = (Class) parameterizedType.getRawType();
        if (cls == CLS_ENUM) {
            return CORE_TYPE_ENUM;
        }
        if (cls == CLS_COMPARABLE) {
            return CORE_TYPE_COMPARABLE;
        }
        if (cls == CLS_CLASS) {
            return CORE_TYPE_CLASS;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        int length = actualTypeArguments == null ? 0 : actualTypeArguments.length;
        if (length == 0) {
            typeBindingsCreate = EMPTY_BINDINGS;
        } else {
            JavaType[] javaTypeArr = new JavaType[length];
            for (int i2 = 0; i2 < length; i2++) {
                javaTypeArr[i2] = _fromAny(classStack, actualTypeArguments[i2], typeBindings);
            }
            typeBindingsCreate = TypeBindings.create(cls, javaTypeArr);
        }
        return _fromClass(classStack, cls, typeBindingsCreate);
    }

    protected JavaType _fromVariable(ClassStack classStack, TypeVariable<?> typeVariable, TypeBindings typeBindings) {
        String name = typeVariable.getName();
        JavaType javaTypeFindBoundType = typeBindings.findBoundType(name);
        if (javaTypeFindBoundType != null) {
            return javaTypeFindBoundType;
        }
        if (typeBindings.hasUnbound(name)) {
            return CORE_TYPE_OBJECT;
        }
        return _fromAny(classStack, typeVariable.getBounds()[0], typeBindings.withUnboundVariable(name));
    }

    protected JavaType _fromWellKnownClass(ClassStack classStack, Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        if (typeBindings == null) {
            typeBindings = TypeBindings.emptyBindings();
        }
        if (cls == Map.class) {
            return _mapType(cls, typeBindings, javaType, javaTypeArr);
        }
        if (cls == Collection.class) {
            return _collectionType(cls, typeBindings, javaType, javaTypeArr);
        }
        if (cls == AtomicReference.class) {
            return _referenceType(cls, typeBindings, javaType, javaTypeArr);
        }
        return null;
    }

    protected JavaType _fromWellKnownInterface(ClassStack classStack, Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        for (JavaType javaType2 : javaTypeArr) {
            JavaType javaTypeRefine = javaType2.refine(cls, typeBindings, javaType, javaTypeArr);
            if (javaTypeRefine != null) {
                return javaTypeRefine;
            }
        }
        return null;
    }

    protected JavaType _fromWildcard(ClassStack classStack, WildcardType wildcardType, TypeBindings typeBindings) {
        return _fromAny(classStack, wildcardType.getUpperBounds()[0], typeBindings);
    }

    protected JavaType _newSimpleType(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        return new SimpleType(cls, typeBindings, javaType, javaTypeArr);
    }

    protected JavaType _resolveSuperClass(ClassStack classStack, Class<?> cls, TypeBindings typeBindings) {
        Type genericSuperclass = ClassUtil.getGenericSuperclass(cls);
        if (genericSuperclass == null) {
            return null;
        }
        return _fromAny(classStack, genericSuperclass, typeBindings);
    }

    protected JavaType[] _resolveSuperInterfaces(ClassStack classStack, Class<?> cls, TypeBindings typeBindings) {
        Type[] genericInterfaces = ClassUtil.getGenericInterfaces(cls);
        if (genericInterfaces == null || genericInterfaces.length == 0) {
            return NO_TYPES;
        }
        int length = genericInterfaces.length;
        JavaType[] javaTypeArr = new JavaType[length];
        for (int i2 = 0; i2 < length; i2++) {
            javaTypeArr[i2] = _fromAny(classStack, genericInterfaces[i2], typeBindings);
        }
        return javaTypeArr;
    }

    protected JavaType _unknownType() {
        return CORE_TYPE_OBJECT;
    }

    protected Class<?> classForName(String str, boolean z, ClassLoader classLoader) throws ClassNotFoundException {
        return Class.forName(str, true, classLoader);
    }

    public CollectionType constructCollectionType(Class<? extends Collection> cls, Class<?> cls2) {
        return constructCollectionType(cls, _fromClass(null, cls2, EMPTY_BINDINGS));
    }

    public JavaType constructFromCanonical(String str) throws IllegalArgumentException {
        return this._parser.parse(str);
    }

    public JavaType constructGeneralizedType(JavaType javaType, Class<?> cls) {
        Class<?> rawClass = javaType.getRawClass();
        if (rawClass == cls) {
            return javaType;
        }
        JavaType javaTypeFindSuperType = javaType.findSuperType(cls);
        if (javaTypeFindSuperType != null) {
            return javaTypeFindSuperType;
        }
        if (cls.isAssignableFrom(rawClass)) {
            throw new IllegalArgumentException(String.format("Internal error: class %s not included as super-type for %s", cls.getName(), javaType));
        }
        throw new IllegalArgumentException(String.format("Class %s not a super-type of %s", cls.getName(), javaType));
    }

    public MapType constructMapType(Class<? extends Map> cls, Class<?> cls2, Class<?> cls3) {
        JavaType javaType_fromClass;
        JavaType javaType_fromClass2;
        if (cls == Properties.class) {
            javaType_fromClass = CORE_TYPE_STRING;
            javaType_fromClass2 = javaType_fromClass;
        } else {
            TypeBindings typeBindings = EMPTY_BINDINGS;
            javaType_fromClass = _fromClass(null, cls2, typeBindings);
            javaType_fromClass2 = _fromClass(null, cls3, typeBindings);
        }
        return constructMapType(cls, javaType_fromClass, javaType_fromClass2);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.fasterxml.jackson.databind.JavaType constructSpecializedType(com.fasterxml.jackson.databind.JavaType r6, java.lang.Class<?> r7) {
        /*
            r5 = this;
            java.lang.Class r0 = r6.getRawClass()
            if (r0 != r7) goto L7
            return r6
        L7:
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            r2 = 0
            if (r0 != r1) goto L16
            com.fasterxml.jackson.databind.type.TypeBindings r0 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings()
            com.fasterxml.jackson.databind.JavaType r7 = r5._fromClass(r2, r7, r0)
            goto Lb9
        L16:
            boolean r1 = r0.isAssignableFrom(r7)
            r3 = 1
            r4 = 0
            if (r1 == 0) goto Lbe
            com.fasterxml.jackson.databind.type.TypeBindings r1 = r6.getBindings()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L32
            com.fasterxml.jackson.databind.type.TypeBindings r0 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings()
            com.fasterxml.jackson.databind.JavaType r7 = r5._fromClass(r2, r7, r0)
            goto Lb9
        L32:
            boolean r1 = r6.isContainerType()
            if (r1 == 0) goto L88
            boolean r1 = r6.isMapLikeType()
            if (r1 == 0) goto L5f
            java.lang.Class<java.util.HashMap> r0 = java.util.HashMap.class
            if (r7 == r0) goto L4e
            java.lang.Class<java.util.LinkedHashMap> r0 = java.util.LinkedHashMap.class
            if (r7 == r0) goto L4e
            java.lang.Class<java.util.EnumMap> r0 = java.util.EnumMap.class
            if (r7 == r0) goto L4e
            java.lang.Class<java.util.TreeMap> r0 = java.util.TreeMap.class
            if (r7 != r0) goto L88
        L4e:
            com.fasterxml.jackson.databind.JavaType r0 = r6.getKeyType()
            com.fasterxml.jackson.databind.JavaType r1 = r6.getContentType()
            com.fasterxml.jackson.databind.type.TypeBindings r0 = com.fasterxml.jackson.databind.type.TypeBindings.create(r7, r0, r1)
            com.fasterxml.jackson.databind.JavaType r7 = r5._fromClass(r2, r7, r0)
            goto Lb9
        L5f:
            boolean r1 = r6.isCollectionLikeType()
            if (r1 == 0) goto L88
            java.lang.Class<java.util.ArrayList> r1 = java.util.ArrayList.class
            if (r7 == r1) goto L7b
            java.lang.Class<java.util.LinkedList> r1 = java.util.LinkedList.class
            if (r7 == r1) goto L7b
            java.lang.Class<java.util.HashSet> r1 = java.util.HashSet.class
            if (r7 == r1) goto L7b
            java.lang.Class<java.util.TreeSet> r1 = java.util.TreeSet.class
            if (r7 != r1) goto L76
            goto L7b
        L76:
            java.lang.Class<java.util.EnumSet> r1 = java.util.EnumSet.class
            if (r0 != r1) goto L88
            return r6
        L7b:
            com.fasterxml.jackson.databind.JavaType r0 = r6.getContentType()
            com.fasterxml.jackson.databind.type.TypeBindings r0 = com.fasterxml.jackson.databind.type.TypeBindings.create(r7, r0)
            com.fasterxml.jackson.databind.JavaType r7 = r5._fromClass(r2, r7, r0)
            goto Lb9
        L88:
            java.lang.reflect.TypeVariable[] r0 = r7.getTypeParameters()
            int r0 = r0.length
            if (r0 != 0) goto L98
            com.fasterxml.jackson.databind.type.TypeBindings r0 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings()
            com.fasterxml.jackson.databind.JavaType r7 = r5._fromClass(r2, r7, r0)
            goto Lb9
        L98:
            com.fasterxml.jackson.databind.type.TypeBindings r0 = r5._bindingsForSubtype(r6, r0, r7)
            boolean r1 = r6.isInterface()
            if (r1 == 0) goto Lab
            com.fasterxml.jackson.databind.JavaType[] r1 = new com.fasterxml.jackson.databind.JavaType[r3]
            r1[r4] = r6
            com.fasterxml.jackson.databind.JavaType r1 = r6.refine(r7, r0, r2, r1)
            goto Lb1
        Lab:
            com.fasterxml.jackson.databind.JavaType[] r1 = com.fasterxml.jackson.databind.type.TypeFactory.NO_TYPES
            com.fasterxml.jackson.databind.JavaType r1 = r6.refine(r7, r0, r6, r1)
        Lb1:
            if (r1 != 0) goto Lb8
            com.fasterxml.jackson.databind.JavaType r7 = r5._fromClass(r2, r7, r0)
            goto Lb9
        Lb8:
            r7 = r1
        Lb9:
            com.fasterxml.jackson.databind.JavaType r6 = r7.withHandlersFrom(r6)
            return r6
        Lbe:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r7 = r7.getName()
            r1[r4] = r7
            r1[r3] = r6
            java.lang.String r6 = "Class %s not subtype of %s"
            java.lang.String r6 = java.lang.String.format(r6, r1)
            r0.<init>(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.type.TypeFactory.constructSpecializedType(com.fasterxml.jackson.databind.JavaType, java.lang.Class):com.fasterxml.jackson.databind.JavaType");
    }

    public JavaType constructType(Type type) {
        return _fromAny(null, type, EMPTY_BINDINGS);
    }

    public Class<?> findClass(String str) throws ClassNotFoundException {
        Class<?> cls_findPrimitive;
        if (str.indexOf(46) < 0 && (cls_findPrimitive = _findPrimitive(str)) != null) {
            return cls_findPrimitive;
        }
        Throwable rootCause = null;
        ClassLoader classLoader = getClassLoader();
        if (classLoader == null) {
            classLoader = Thread.currentThread().getContextClassLoader();
        }
        if (classLoader != null) {
            try {
                return classForName(str, true, classLoader);
            } catch (Exception e2) {
                rootCause = ClassUtil.getRootCause(e2);
            }
        }
        try {
            return classForName(str);
        } catch (Exception e3) {
            if (rootCause == null) {
                rootCause = ClassUtil.getRootCause(e3);
            }
            if (rootCause instanceof RuntimeException) {
                throw ((RuntimeException) rootCause);
            }
            throw new ClassNotFoundException(rootCause.getMessage(), rootCause);
        }
    }

    public JavaType[] findTypeParameters(JavaType javaType, Class<?> cls) {
        JavaType javaTypeFindSuperType = javaType.findSuperType(cls);
        return javaTypeFindSuperType == null ? NO_TYPES : javaTypeFindSuperType.getBindings().typeParameterArray();
    }

    public ClassLoader getClassLoader() {
        return this._classLoader;
    }

    @Deprecated
    public JavaType uncheckedSimpleType(Class<?> cls) {
        return _constructSimple(cls, EMPTY_BINDINGS, null, null);
    }

    protected TypeFactory(LRUMap<Object, JavaType> lRUMap) {
        this._typeCache = lRUMap == null ? new LRUMap<>(16, 200) : lRUMap;
        this._parser = new TypeParser(this);
        this._modifiers = null;
        this._classLoader = null;
    }

    protected Class<?> classForName(String str) throws ClassNotFoundException {
        return Class.forName(str);
    }

    public CollectionType constructCollectionType(Class<? extends Collection> cls, JavaType javaType) {
        return (CollectionType) _fromClass(null, cls, TypeBindings.create(cls, javaType));
    }

    public JavaType constructType(Type type, TypeBindings typeBindings) {
        return _fromAny(null, type, typeBindings);
    }

    public JavaType constructType(TypeReference<?> typeReference) {
        return _fromAny(null, typeReference.getType(), EMPTY_BINDINGS);
    }

    public MapType constructMapType(Class<? extends Map> cls, JavaType javaType, JavaType javaType2) {
        return (MapType) _fromClass(null, cls, TypeBindings.create(cls, new JavaType[]{javaType, javaType2}));
    }
}
