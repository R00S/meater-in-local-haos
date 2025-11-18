package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.introspect.TypeResolutionContext;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class AnnotatedClass extends Annotated implements TypeResolutionContext {
    private static final AnnotationMap[] NO_ANNOTATION_MAPS = new AnnotationMap[0];
    protected final AnnotationIntrospector _annotationIntrospector;
    protected final TypeBindings _bindings;
    protected final Class<?> _class;
    protected AnnotationMap _classAnnotations;
    protected List<AnnotatedConstructor> _constructors;
    protected List<AnnotatedMethod> _creatorMethods;
    protected boolean _creatorsResolved = false;
    protected AnnotatedConstructor _defaultConstructor;
    protected List<AnnotatedField> _fields;
    protected AnnotatedMethodMap _memberMethods;
    protected final ClassIntrospector.MixInResolver _mixInResolver;
    protected final Class<?> _primaryMixIn;
    protected final List<JavaType> _superTypes;
    protected final JavaType _type;
    protected final TypeFactory _typeFactory;

    private AnnotatedClass(JavaType javaType, Class<?> cls, TypeBindings typeBindings, List<JavaType> list, AnnotationIntrospector annotationIntrospector, ClassIntrospector.MixInResolver mixInResolver, TypeFactory typeFactory, AnnotationMap annotationMap) {
        this._type = javaType;
        this._class = cls;
        this._bindings = typeBindings;
        this._superTypes = list;
        this._annotationIntrospector = annotationIntrospector;
        this._typeFactory = typeFactory;
        this._mixInResolver = mixInResolver;
        this._primaryMixIn = mixInResolver == null ? null : mixInResolver.findMixInClassFor(cls);
        this._classAnnotations = annotationMap;
    }

    private AnnotationMap _addAnnotationsIfNotPresent(AnnotationMap annotationMap, Annotation[] annotationArr) {
        if (annotationArr != null) {
            List<Annotation> list_addFromBundle = null;
            for (Annotation annotation : annotationArr) {
                if (annotationMap.addIfNotPresent(annotation) && _isAnnotationBundle(annotation)) {
                    list_addFromBundle = _addFromBundle(annotation, list_addFromBundle);
                }
            }
            if (list_addFromBundle != null) {
                _addAnnotationsIfNotPresent(annotationMap, (Annotation[]) list_addFromBundle.toArray(new Annotation[list_addFromBundle.size()]));
            }
        }
        return annotationMap;
    }

    private List<Annotation> _addFromBundle(Annotation annotation, List<Annotation> list) {
        for (Annotation annotation2 : ClassUtil.findClassAnnotations(annotation.annotationType())) {
            if (!(annotation2 instanceof Target) && !(annotation2 instanceof Retention)) {
                if (list == null) {
                    list = new ArrayList<>();
                }
                list.add(annotation2);
            }
        }
        return list;
    }

    private void _addOrOverrideAnnotations(AnnotatedMember annotatedMember, Annotation[] annotationArr) {
        if (annotationArr != null) {
            List<Annotation> list_addFromBundle = null;
            for (Annotation annotation : annotationArr) {
                if (annotatedMember.addOrOverride(annotation) && _isAnnotationBundle(annotation)) {
                    list_addFromBundle = _addFromBundle(annotation, list_addFromBundle);
                }
            }
            if (list_addFromBundle != null) {
                _addOrOverrideAnnotations(annotatedMember, (Annotation[]) list_addFromBundle.toArray(new Annotation[list_addFromBundle.size()]));
            }
        }
    }

    private AnnotationMap _classAnnotations() {
        AnnotationMap annotationMap_resolveClassAnnotations = this._classAnnotations;
        if (annotationMap_resolveClassAnnotations == null) {
            synchronized (this) {
                annotationMap_resolveClassAnnotations = this._classAnnotations;
                if (annotationMap_resolveClassAnnotations == null) {
                    annotationMap_resolveClassAnnotations = _resolveClassAnnotations();
                    this._classAnnotations = annotationMap_resolveClassAnnotations;
                }
            }
        }
        return annotationMap_resolveClassAnnotations;
    }

    private AnnotationMap _emptyAnnotationMap() {
        return new AnnotationMap();
    }

    private AnnotationMap[] _emptyAnnotationMaps(int i2) {
        if (i2 == 0) {
            return NO_ANNOTATION_MAPS;
        }
        AnnotationMap[] annotationMapArr = new AnnotationMap[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            annotationMapArr[i3] = _emptyAnnotationMap();
        }
        return annotationMapArr;
    }

    private final boolean _isAnnotationBundle(Annotation annotation) {
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        return annotationIntrospector != null && annotationIntrospector.isAnnotationBundle(annotation);
    }

    private boolean _isIncludableConstructor(Constructor<?> constructor) {
        return !constructor.isSynthetic();
    }

    private boolean _isIncludableField(Field field) {
        return (field.isSynthetic() || Modifier.isStatic(field.getModifiers())) ? false : true;
    }

    private AnnotationMap _resolveClassAnnotations() {
        AnnotationMap annotationMap = new AnnotationMap();
        if (this._annotationIntrospector != null) {
            Class<?> cls = this._primaryMixIn;
            if (cls != null) {
                _addClassMixIns(annotationMap, this._class, cls);
            }
            _addAnnotationsIfNotPresent(annotationMap, ClassUtil.findClassAnnotations(this._class));
            for (JavaType javaType : this._superTypes) {
                _addClassMixIns(annotationMap, javaType);
                _addAnnotationsIfNotPresent(annotationMap, ClassUtil.findClassAnnotations(javaType.getRawClass()));
            }
            _addClassMixIns(annotationMap, Object.class);
        }
        return annotationMap;
    }

    public static AnnotatedClass construct(JavaType javaType, MapperConfig<?> mapperConfig) {
        return new AnnotatedClass(javaType, javaType.getRawClass(), javaType.getBindings(), ClassUtil.findSuperTypes(javaType, null, false), mapperConfig.isAnnotationProcessingEnabled() ? mapperConfig.getAnnotationIntrospector() : null, mapperConfig, mapperConfig.getTypeFactory(), null);
    }

    public static AnnotatedClass constructWithoutSuperTypes(Class<?> cls, MapperConfig<?> mapperConfig) {
        if (mapperConfig == null) {
            return new AnnotatedClass(null, cls, TypeBindings.emptyBindings(), Collections.emptyList(), null, null, null, null);
        }
        return new AnnotatedClass(null, cls, TypeBindings.emptyBindings(), Collections.emptyList(), mapperConfig.isAnnotationProcessingEnabled() ? mapperConfig.getAnnotationIntrospector() : null, mapperConfig, mapperConfig.getTypeFactory(), null);
    }

    private void resolveCreators() throws SecurityException {
        ArrayList arrayList;
        ArrayList arrayList2 = null;
        if (this._type.isEnumType()) {
            arrayList = null;
        } else {
            ClassUtil.Ctor[] constructors = ClassUtil.getConstructors(this._class);
            arrayList = null;
            for (ClassUtil.Ctor ctor : constructors) {
                if (_isIncludableConstructor(ctor.getConstructor())) {
                    if (ctor.getParamCount() == 0) {
                        this._defaultConstructor = _constructDefaultConstructor(ctor, this);
                    } else {
                        if (arrayList == null) {
                            arrayList = new ArrayList(Math.max(10, constructors.length));
                        }
                        arrayList.add(_constructNonDefaultConstructor(ctor, this));
                    }
                }
            }
        }
        if (arrayList == null) {
            this._constructors = Collections.emptyList();
        } else {
            this._constructors = arrayList;
        }
        if (this._primaryMixIn != null && (this._defaultConstructor != null || !this._constructors.isEmpty())) {
            _addConstructorMixIns(this._primaryMixIn);
        }
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        if (annotationIntrospector != null) {
            AnnotatedConstructor annotatedConstructor = this._defaultConstructor;
            if (annotatedConstructor != null && annotationIntrospector.hasIgnoreMarker(annotatedConstructor)) {
                this._defaultConstructor = null;
            }
            List<AnnotatedConstructor> list = this._constructors;
            if (list != null) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    } else if (this._annotationIntrospector.hasIgnoreMarker(this._constructors.get(size))) {
                        this._constructors.remove(size);
                    }
                }
            }
        }
        for (Method method : _findClassMethods(this._class)) {
            if (Modifier.isStatic(method.getModifiers())) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList(8);
                }
                arrayList2.add(_constructCreatorMethod(method, this));
            }
        }
        if (arrayList2 == null) {
            this._creatorMethods = Collections.emptyList();
        } else {
            this._creatorMethods = arrayList2;
            Class<?> cls = this._primaryMixIn;
            if (cls != null) {
                _addFactoryMixIns(cls);
            }
            if (this._annotationIntrospector != null) {
                int size2 = this._creatorMethods.size();
                while (true) {
                    size2--;
                    if (size2 < 0) {
                        break;
                    } else if (this._annotationIntrospector.hasIgnoreMarker(this._creatorMethods.get(size2))) {
                        this._creatorMethods.remove(size2);
                    }
                }
            }
        }
        this._creatorsResolved = true;
    }

    private void resolveFields() {
        Map<String, AnnotatedField> map_findFields = _findFields(this._type, this, null);
        if (map_findFields == null || map_findFields.size() == 0) {
            this._fields = Collections.emptyList();
            return;
        }
        ArrayList arrayList = new ArrayList(map_findFields.size());
        this._fields = arrayList;
        arrayList.addAll(map_findFields.values());
    }

    private void resolveMemberMethods() throws NoSuchMethodException, SecurityException {
        Class<?> clsFindMixInClassFor;
        this._memberMethods = new AnnotatedMethodMap();
        AnnotatedMethodMap annotatedMethodMap = new AnnotatedMethodMap();
        _addMemberMethods(this._class, this, this._memberMethods, this._primaryMixIn, annotatedMethodMap);
        for (JavaType javaType : this._superTypes) {
            ClassIntrospector.MixInResolver mixInResolver = this._mixInResolver;
            _addMemberMethods(javaType.getRawClass(), new TypeResolutionContext.Basic(this._typeFactory, javaType.getBindings()), this._memberMethods, mixInResolver == null ? null : mixInResolver.findMixInClassFor(javaType.getRawClass()), annotatedMethodMap);
        }
        ClassIntrospector.MixInResolver mixInResolver2 = this._mixInResolver;
        if (mixInResolver2 != null && (clsFindMixInClassFor = mixInResolver2.findMixInClassFor(Object.class)) != null) {
            _addMethodMixIns(this._class, this._memberMethods, clsFindMixInClassFor, annotatedMethodMap);
        }
        if (this._annotationIntrospector == null || annotatedMethodMap.isEmpty()) {
            return;
        }
        Iterator<AnnotatedMethod> it = annotatedMethodMap.iterator();
        while (it.hasNext()) {
            AnnotatedMethod next = it.next();
            try {
                Method declaredMethod = Object.class.getDeclaredMethod(next.getName(), next.getRawParameterTypes());
                if (declaredMethod != null) {
                    AnnotatedMethod annotatedMethod_constructMethod = _constructMethod(declaredMethod, this);
                    _addMixOvers(next.getAnnotated(), annotatedMethod_constructMethod, false);
                    this._memberMethods.add(annotatedMethod_constructMethod);
                }
            } catch (Exception unused) {
            }
        }
    }

    protected void _addClassMixIns(AnnotationMap annotationMap, JavaType javaType) {
        if (this._mixInResolver != null) {
            Class<?> rawClass = javaType.getRawClass();
            _addClassMixIns(annotationMap, rawClass, this._mixInResolver.findMixInClassFor(rawClass));
        }
    }

    protected void _addConstructorMixIns(Class<?> cls) throws SecurityException {
        List<AnnotatedConstructor> list = this._constructors;
        int size = list == null ? 0 : list.size();
        MemberKey[] memberKeyArr = null;
        for (ClassUtil.Ctor ctor : ClassUtil.getConstructors(cls)) {
            Constructor<?> constructor = ctor.getConstructor();
            if (constructor.getParameterTypes().length != 0) {
                if (memberKeyArr == null) {
                    memberKeyArr = new MemberKey[size];
                    for (int i2 = 0; i2 < size; i2++) {
                        memberKeyArr[i2] = new MemberKey(this._constructors.get(i2).getAnnotated());
                    }
                }
                MemberKey memberKey = new MemberKey(constructor);
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        break;
                    }
                    if (memberKey.equals(memberKeyArr[i3])) {
                        _addMixOvers(constructor, this._constructors.get(i3), true);
                        break;
                    }
                    i3++;
                }
            } else {
                AnnotatedConstructor annotatedConstructor = this._defaultConstructor;
                if (annotatedConstructor != null) {
                    _addMixOvers(constructor, annotatedConstructor, false);
                }
            }
        }
    }

    protected void _addFactoryMixIns(Class<?> cls) {
        int size = this._creatorMethods.size();
        MemberKey[] memberKeyArr = null;
        for (Method method : ClassUtil.getDeclaredMethods(cls)) {
            if (Modifier.isStatic(method.getModifiers()) && method.getParameterTypes().length != 0) {
                if (memberKeyArr == null) {
                    memberKeyArr = new MemberKey[size];
                    for (int i2 = 0; i2 < size; i2++) {
                        memberKeyArr[i2] = new MemberKey(this._creatorMethods.get(i2).getAnnotated());
                    }
                }
                MemberKey memberKey = new MemberKey(method);
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        break;
                    }
                    if (memberKey.equals(memberKeyArr[i3])) {
                        _addMixOvers(method, this._creatorMethods.get(i3), true);
                        break;
                    }
                    i3++;
                }
            }
        }
    }

    protected void _addFieldMixIns(Class<?> cls, Class<?> cls2, Map<String, AnnotatedField> map) {
        AnnotatedField annotatedField;
        Iterator<Class<?>> it = ClassUtil.findSuperClasses(cls, cls2, true).iterator();
        while (it.hasNext()) {
            for (Field field : ClassUtil.getDeclaredFields(it.next())) {
                if (_isIncludableField(field) && (annotatedField = map.get(field.getName())) != null) {
                    _addOrOverrideAnnotations(annotatedField, field.getDeclaredAnnotations());
                }
            }
        }
    }

    protected void _addMemberMethods(Class<?> cls, TypeResolutionContext typeResolutionContext, AnnotatedMethodMap annotatedMethodMap, Class<?> cls2, AnnotatedMethodMap annotatedMethodMap2) {
        if (cls2 != null) {
            _addMethodMixIns(cls, annotatedMethodMap, cls2, annotatedMethodMap2);
        }
        if (cls == null) {
            return;
        }
        for (Method method : _findClassMethods(cls)) {
            if (_isIncludableMemberMethod(method)) {
                AnnotatedMethod annotatedMethodFind = annotatedMethodMap.find(method);
                if (annotatedMethodFind == null) {
                    AnnotatedMethod annotatedMethod_constructMethod = _constructMethod(method, typeResolutionContext);
                    annotatedMethodMap.add(annotatedMethod_constructMethod);
                    AnnotatedMethod annotatedMethodRemove = annotatedMethodMap2.remove(method);
                    if (annotatedMethodRemove != null) {
                        _addMixOvers(annotatedMethodRemove.getAnnotated(), annotatedMethod_constructMethod, false);
                    }
                } else {
                    _addMixUnders(method, annotatedMethodFind);
                    if (annotatedMethodFind.getDeclaringClass().isInterface() && !method.getDeclaringClass().isInterface()) {
                        annotatedMethodMap.add(annotatedMethodFind.withMethod(method));
                    }
                }
            }
        }
    }

    protected void _addMethodMixIns(Class<?> cls, AnnotatedMethodMap annotatedMethodMap, Class<?> cls2, AnnotatedMethodMap annotatedMethodMap2) {
        Iterator<Class<?>> it = ClassUtil.findRawSuperTypes(cls2, cls, true).iterator();
        while (it.hasNext()) {
            for (Method method : ClassUtil.getDeclaredMethods(it.next())) {
                if (_isIncludableMemberMethod(method)) {
                    AnnotatedMethod annotatedMethodFind = annotatedMethodMap.find(method);
                    if (annotatedMethodFind != null) {
                        _addMixUnders(method, annotatedMethodFind);
                    } else {
                        AnnotatedMethod annotatedMethodFind2 = annotatedMethodMap2.find(method);
                        if (annotatedMethodFind2 != null) {
                            _addMixUnders(method, annotatedMethodFind2);
                        } else {
                            annotatedMethodMap2.add(_constructMethod(method, this));
                        }
                    }
                }
            }
        }
    }

    protected void _addMixOvers(Constructor<?> constructor, AnnotatedConstructor annotatedConstructor, boolean z) {
        _addOrOverrideAnnotations(annotatedConstructor, constructor.getDeclaredAnnotations());
        if (z) {
            Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
            int length = parameterAnnotations.length;
            for (int i2 = 0; i2 < length; i2++) {
                for (Annotation annotation : parameterAnnotations[i2]) {
                    annotatedConstructor.addOrOverrideParam(i2, annotation);
                }
            }
        }
    }

    protected void _addMixUnders(Method method, AnnotatedMethod annotatedMethod) {
        _addAnnotationsIfNotPresent(annotatedMethod, method.getDeclaredAnnotations());
    }

    protected AnnotationMap[] _collectRelevantAnnotations(Annotation[][] annotationArr) {
        int length = annotationArr.length;
        AnnotationMap[] annotationMapArr = new AnnotationMap[length];
        for (int i2 = 0; i2 < length; i2++) {
            annotationMapArr[i2] = _collectRelevantAnnotations(annotationArr[i2]);
        }
        return annotationMapArr;
    }

    protected AnnotatedMethod _constructCreatorMethod(Method method, TypeResolutionContext typeResolutionContext) {
        int length = method.getParameterTypes().length;
        return this._annotationIntrospector == null ? new AnnotatedMethod(typeResolutionContext, method, _emptyAnnotationMap(), _emptyAnnotationMaps(length)) : length == 0 ? new AnnotatedMethod(typeResolutionContext, method, _collectRelevantAnnotations(method.getDeclaredAnnotations()), NO_ANNOTATION_MAPS) : new AnnotatedMethod(typeResolutionContext, method, _collectRelevantAnnotations(method.getDeclaredAnnotations()), _collectRelevantAnnotations(method.getParameterAnnotations()));
    }

    protected AnnotatedConstructor _constructDefaultConstructor(ClassUtil.Ctor ctor, TypeResolutionContext typeResolutionContext) {
        return this._annotationIntrospector == null ? new AnnotatedConstructor(typeResolutionContext, ctor.getConstructor(), _emptyAnnotationMap(), NO_ANNOTATION_MAPS) : new AnnotatedConstructor(typeResolutionContext, ctor.getConstructor(), _collectRelevantAnnotations(ctor.getDeclaredAnnotations()), NO_ANNOTATION_MAPS);
    }

    protected AnnotatedField _constructField(Field field, TypeResolutionContext typeResolutionContext) {
        return this._annotationIntrospector == null ? new AnnotatedField(typeResolutionContext, field, _emptyAnnotationMap()) : new AnnotatedField(typeResolutionContext, field, _collectRelevantAnnotations(field.getDeclaredAnnotations()));
    }

    protected AnnotatedMethod _constructMethod(Method method, TypeResolutionContext typeResolutionContext) {
        return this._annotationIntrospector == null ? new AnnotatedMethod(typeResolutionContext, method, _emptyAnnotationMap(), null) : new AnnotatedMethod(typeResolutionContext, method, _collectRelevantAnnotations(method.getDeclaredAnnotations()), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected com.fasterxml.jackson.databind.introspect.AnnotatedConstructor _constructNonDefaultConstructor(com.fasterxml.jackson.databind.util.ClassUtil.Ctor r9, com.fasterxml.jackson.databind.introspect.TypeResolutionContext r10) {
        /*
            r8 = this;
            int r0 = r9.getParamCount()
            com.fasterxml.jackson.databind.AnnotationIntrospector r1 = r8._annotationIntrospector
            if (r1 != 0) goto L1a
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor r1 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor
            java.lang.reflect.Constructor r9 = r9.getConstructor()
            com.fasterxml.jackson.databind.introspect.AnnotationMap r2 = r8._emptyAnnotationMap()
            com.fasterxml.jackson.databind.introspect.AnnotationMap[] r0 = r8._emptyAnnotationMaps(r0)
            r1.<init>(r10, r9, r2, r0)
            return r1
        L1a:
            if (r0 != 0) goto L30
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor r0 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor
            java.lang.reflect.Constructor r1 = r9.getConstructor()
            java.lang.annotation.Annotation[] r9 = r9.getDeclaredAnnotations()
            com.fasterxml.jackson.databind.introspect.AnnotationMap r9 = r8._collectRelevantAnnotations(r9)
            com.fasterxml.jackson.databind.introspect.AnnotationMap[] r2 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.NO_ANNOTATION_MAPS
            r0.<init>(r10, r1, r9, r2)
            return r0
        L30:
            java.lang.annotation.Annotation[][] r1 = r9.getParameterAnnotations()
            int r2 = r1.length
            if (r0 == r2) goto La8
            r2 = 0
            java.lang.Class r3 = r9.getDeclaringClass()
            boolean r4 = r3.isEnum()
            r5 = 0
            if (r4 == 0) goto L58
            int r4 = r1.length
            r6 = 2
            int r4 = r4 + r6
            if (r0 != r4) goto L58
            int r2 = r1.length
            int r2 = r2 + r6
            java.lang.annotation.Annotation[][] r2 = new java.lang.annotation.Annotation[r2][]
            int r3 = r1.length
            java.lang.System.arraycopy(r1, r5, r2, r6, r3)
            com.fasterxml.jackson.databind.introspect.AnnotationMap[] r1 = r8._collectRelevantAnnotations(r2)
        L54:
            r7 = r2
            r2 = r1
            r1 = r7
            goto L70
        L58:
            boolean r3 = r3.isMemberClass()
            if (r3 == 0) goto L70
            int r3 = r1.length
            r4 = 1
            int r3 = r3 + r4
            if (r0 != r3) goto L70
            int r2 = r1.length
            int r2 = r2 + r4
            java.lang.annotation.Annotation[][] r2 = new java.lang.annotation.Annotation[r2][]
            int r3 = r1.length
            java.lang.System.arraycopy(r1, r5, r2, r4, r3)
            com.fasterxml.jackson.databind.introspect.AnnotationMap[] r1 = r8._collectRelevantAnnotations(r2)
            goto L54
        L70:
            if (r2 == 0) goto L73
            goto Lac
        L73:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Internal error: constructor for "
            r2.append(r3)
            java.lang.Class r9 = r9.getDeclaringClass()
            java.lang.String r9 = r9.getName()
            r2.append(r9)
            java.lang.String r9 = " has mismatch: "
            r2.append(r9)
            r2.append(r0)
            java.lang.String r9 = " parameters; "
            r2.append(r9)
            int r9 = r1.length
            r2.append(r9)
            java.lang.String r9 = " sets of annotations"
            r2.append(r9)
            java.lang.String r9 = r2.toString()
            r10.<init>(r9)
            throw r10
        La8:
            com.fasterxml.jackson.databind.introspect.AnnotationMap[] r2 = r8._collectRelevantAnnotations(r1)
        Lac:
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor r0 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor
            java.lang.reflect.Constructor r1 = r9.getConstructor()
            java.lang.annotation.Annotation[] r9 = r9.getDeclaredAnnotations()
            com.fasterxml.jackson.databind.introspect.AnnotationMap r9 = r8._collectRelevantAnnotations(r9)
            r0.<init>(r10, r1, r9, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.introspect.AnnotatedClass._constructNonDefaultConstructor(com.fasterxml.jackson.databind.util.ClassUtil$Ctor, com.fasterxml.jackson.databind.introspect.TypeResolutionContext):com.fasterxml.jackson.databind.introspect.AnnotatedConstructor");
    }

    protected Method[] _findClassMethods(Class<?> cls) {
        try {
            return ClassUtil.getDeclaredMethods(cls);
        } catch (NoClassDefFoundError e2) {
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            if (contextClassLoader == null) {
                throw e2;
            }
            try {
                return contextClassLoader.loadClass(cls.getName()).getDeclaredMethods();
            } catch (ClassNotFoundException unused) {
                throw e2;
            }
        }
    }

    protected Map<String, AnnotatedField> _findFields(JavaType javaType, TypeResolutionContext typeResolutionContext, Map<String, AnnotatedField> map) {
        Class<?> clsFindMixInClassFor;
        JavaType superClass = javaType.getSuperClass();
        if (superClass != null) {
            Class<?> rawClass = javaType.getRawClass();
            map = _findFields(superClass, new TypeResolutionContext.Basic(this._typeFactory, superClass.getBindings()), map);
            for (Field field : ClassUtil.getDeclaredFields(rawClass)) {
                if (_isIncludableField(field)) {
                    if (map == null) {
                        map = new LinkedHashMap<>();
                    }
                    map.put(field.getName(), _constructField(field, typeResolutionContext));
                }
            }
            ClassIntrospector.MixInResolver mixInResolver = this._mixInResolver;
            if (mixInResolver != null && (clsFindMixInClassFor = mixInResolver.findMixInClassFor(rawClass)) != null) {
                _addFieldMixIns(clsFindMixInClassFor, rawClass, map);
            }
        }
        return map;
    }

    protected boolean _isIncludableMemberMethod(Method method) {
        return (Modifier.isStatic(method.getModifiers()) || method.isSynthetic() || method.isBridge() || method.getParameterTypes().length > 2) ? false : true;
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj != null && obj.getClass() == AnnotatedClass.class && ((AnnotatedClass) obj)._class == this._class;
    }

    public Iterable<AnnotatedField> fields() {
        if (this._fields == null) {
            resolveFields();
        }
        return this._fields;
    }

    public AnnotatedMethod findMethod(String str, Class<?>[] clsArr) throws NoSuchMethodException, SecurityException {
        if (this._memberMethods == null) {
            resolveMemberMethods();
        }
        return this._memberMethods.find(str, clsArr);
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public Class<?> getAnnotated() {
        return this._class;
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        return (A) _classAnnotations().get(cls);
    }

    public Annotations getAnnotations() {
        return _classAnnotations();
    }

    public List<AnnotatedConstructor> getConstructors() throws SecurityException {
        if (!this._creatorsResolved) {
            resolveCreators();
        }
        return this._constructors;
    }

    public AnnotatedConstructor getDefaultConstructor() throws SecurityException {
        if (!this._creatorsResolved) {
            resolveCreators();
        }
        return this._defaultConstructor;
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public String getName() {
        return this._class.getName();
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public Class<?> getRawType() {
        return this._class;
    }

    public List<AnnotatedMethod> getStaticMethods() throws SecurityException {
        if (!this._creatorsResolved) {
            resolveCreators();
        }
        return this._creatorMethods;
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public boolean hasAnnotation(Class<?> cls) {
        return _classAnnotations().has(cls);
    }

    public boolean hasAnnotations() {
        return _classAnnotations().size() > 0;
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public boolean hasOneOf(Class<? extends Annotation>[] clsArr) {
        return _classAnnotations().hasOneOf(clsArr);
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public int hashCode() {
        return this._class.getName().hashCode();
    }

    public Iterable<AnnotatedMethod> memberMethods() throws NoSuchMethodException, SecurityException {
        if (this._memberMethods == null) {
            resolveMemberMethods();
        }
        return this._memberMethods;
    }

    @Override // com.fasterxml.jackson.databind.introspect.TypeResolutionContext
    public JavaType resolveType(Type type) {
        return this._typeFactory.constructType(type, this._bindings);
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public String toString() {
        return "[AnnotedClass " + this._class.getName() + "]";
    }

    public static AnnotatedClass construct(JavaType javaType, MapperConfig<?> mapperConfig, ClassIntrospector.MixInResolver mixInResolver) {
        return new AnnotatedClass(javaType, javaType.getRawClass(), javaType.getBindings(), ClassUtil.findSuperTypes(javaType, null, false), mapperConfig.isAnnotationProcessingEnabled() ? mapperConfig.getAnnotationIntrospector() : null, mixInResolver, mapperConfig.getTypeFactory(), null);
    }

    protected void _addClassMixIns(AnnotationMap annotationMap, Class<?> cls) {
        ClassIntrospector.MixInResolver mixInResolver = this._mixInResolver;
        if (mixInResolver != null) {
            _addClassMixIns(annotationMap, cls, mixInResolver.findMixInClassFor(cls));
        }
    }

    protected AnnotationMap _collectRelevantAnnotations(Annotation[] annotationArr) {
        return _addAnnotationsIfNotPresent(new AnnotationMap(), annotationArr);
    }

    private void _addAnnotationsIfNotPresent(AnnotatedMember annotatedMember, Annotation[] annotationArr) {
        if (annotationArr != null) {
            List<Annotation> list_addFromBundle = null;
            for (Annotation annotation : annotationArr) {
                if (annotatedMember.addIfNotPresent(annotation) && _isAnnotationBundle(annotation)) {
                    list_addFromBundle = _addFromBundle(annotation, list_addFromBundle);
                }
            }
            if (list_addFromBundle != null) {
                _addAnnotationsIfNotPresent(annotatedMember, (Annotation[]) list_addFromBundle.toArray(new Annotation[list_addFromBundle.size()]));
            }
        }
    }

    protected void _addClassMixIns(AnnotationMap annotationMap, Class<?> cls, Class<?> cls2) {
        if (cls2 == null) {
            return;
        }
        _addAnnotationsIfNotPresent(annotationMap, ClassUtil.findClassAnnotations(cls2));
        Iterator<Class<?>> it = ClassUtil.findSuperClasses(cls2, cls, false).iterator();
        while (it.hasNext()) {
            _addAnnotationsIfNotPresent(annotationMap, ClassUtil.findClassAnnotations(it.next()));
        }
    }

    protected void _addMixOvers(Method method, AnnotatedMethod annotatedMethod, boolean z) {
        _addOrOverrideAnnotations(annotatedMethod, method.getDeclaredAnnotations());
        if (z) {
            Annotation[][] parameterAnnotations = method.getParameterAnnotations();
            int length = parameterAnnotations.length;
            for (int i2 = 0; i2 < length; i2++) {
                for (Annotation annotation : parameterAnnotations[i2]) {
                    annotatedMethod.addOrOverrideParam(i2, annotation);
                }
            }
        }
    }
}
