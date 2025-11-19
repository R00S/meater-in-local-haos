package com.squareup.wire.internal;

import Aa.a;
import Ba.l;
import Ba.p;
import Ia.d;
import Ub.k;
import com.squareup.wire.KotlinConstructorBuilder;
import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.collections.r;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.W;
import oa.C4153F;

/* compiled from: FieldBinding.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 O*\u0014\b\u0000\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001*\u0014\b\u0001\u0010\u0004*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005:\u0001OBI\b\u0000\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J7\u0010\u0016\u001a\u0016\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u00150\u00132\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J1\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00182\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00182\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00028\u00012\u0006\u0010\u001e\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010 \u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00028\u00012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b \u0010\u001fJ\u001a\u0010\"\u001a\u0004\u0018\u00010\u00142\u0006\u0010!\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\"\u0010#J\u0019\u0010$\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001d\u001a\u00028\u0001H\u0016¢\u0006\u0004\b$\u0010%R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010&R\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010'\u001a\u0004\b(\u0010)R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010*R\u001a\u0010,\u001a\u00020+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001a\u00101\u001a\u0002008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001a\u00105\u001a\u0002008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00102\u001a\u0004\b6\u00104R\u001a\u00107\u001a\u0002008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u00102\u001a\u0004\b8\u00104R\u001a\u0010:\u001a\u0002098\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0014\u0010>\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u00102R\u0014\u0010?\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u00102R\u001a\u0010@\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u0010'\u001a\u0004\bA\u0010)R(\u0010B\u001a\u0016\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u00150\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\"\u0010D\u001a\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\"\u0010F\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010ER\u0018\u0010J\u001a\u0006\u0012\u0002\b\u00030G8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0018\u0010L\u001a\u0006\u0012\u0002\b\u00030G8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u0010IR\u0014\u0010M\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bM\u0010)R\u0014\u0010N\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010)¨\u0006P"}, d2 = {"Lcom/squareup/wire/internal/FieldBinding;", "Lcom/squareup/wire/Message;", "M", "Lcom/squareup/wire/Message$Builder;", "B", "Lcom/squareup/wire/internal/FieldOrOneOfBinding;", "Lcom/squareup/wire/WireField;", "wireField", "Ljava/lang/Class;", "messageType", "Ljava/lang/reflect/Field;", "messageField", "builderType", "", "writeIdentityValues", "Ljava/lang/ClassLoader;", "classLoader", "<init>", "(Lcom/squareup/wire/WireField;Ljava/lang/Class;Ljava/lang/reflect/Field;Ljava/lang/Class;ZLjava/lang/ClassLoader;)V", "Lkotlin/Function2;", "", "Loa/F;", "getBuilderSetter", "(Ljava/lang/Class;Lcom/squareup/wire/WireField;)LBa/p;", "Lkotlin/Function1;", "getBuilderGetter", "(Ljava/lang/Class;Lcom/squareup/wire/WireField;)LBa/l;", "getInstanceGetter", "(Ljava/lang/Class;)LBa/l;", "builder", "value", "(Lcom/squareup/wire/Message$Builder;Ljava/lang/Object;)V", "set", "message", "get", "(Lcom/squareup/wire/Message;)Ljava/lang/Object;", "getFromBuilder", "(Lcom/squareup/wire/Message$Builder;)Ljava/lang/Object;", "Ljava/lang/reflect/Field;", "Z", "getWriteIdentityValues", "()Z", "Ljava/lang/ClassLoader;", "Lcom/squareup/wire/WireField$Label;", "label", "Lcom/squareup/wire/WireField$Label;", "getLabel", "()Lcom/squareup/wire/WireField$Label;", "", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "wireFieldJsonName", "getWireFieldJsonName", "declaredName", "getDeclaredName", "", "tag", "I", "getTag", "()I", "keyAdapterString", "adapterString", "redacted", "getRedacted", "builderSetter", "LBa/p;", "builderGetter", "LBa/l;", "instanceGetter", "Lcom/squareup/wire/ProtoAdapter;", "getKeyAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "keyAdapter", "getSingleAdapter", "singleAdapter", "isMap", "isMessage", "Companion", "wire-runtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FieldBinding<M extends Message<M, B>, B extends Message.Builder<M, B>> extends FieldOrOneOfBinding<M, B> {
    private static final k IS_GETTER_FIELD_NAME_REGEX = new k("^is[^a-z].*$");
    private final String adapterString;
    private final l<B, Object> builderGetter;
    private final p<B, Object, C4153F> builderSetter;
    private final ClassLoader classLoader;
    private final String declaredName;
    private final l<M, Object> instanceGetter;
    private final String keyAdapterString;
    private final WireField.Label label;
    private final Field messageField;
    private final String name;
    private final boolean redacted;
    private final int tag;
    private final String wireFieldJsonName;
    private final boolean writeIdentityValues;

    /* compiled from: FieldBinding.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0014\b\u0000\u0010\u0002*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0014\b\u0001\u0010\u0004*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0006\u001a\u0002H\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "M", "Lcom/squareup/wire/Message;", "B", "Lcom/squareup/wire/Message$Builder;", "builder", "invoke", "(Lcom/squareup/wire/Message$Builder;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.squareup.wire.internal.FieldBinding$getBuilderGetter$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC3864v implements l<B, Object> {
        final /* synthetic */ WireField $wireField;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(WireField wireField) {
            super(1);
            this.$wireField = wireField;
        }

        @Override // Ba.l
        public final Object invoke(B builder) {
            C3862t.g(builder, "builder");
            return ((KotlinConstructorBuilder) builder).get(this.$wireField);
        }
    }

    /* compiled from: FieldBinding.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0014\b\u0000\u0010\u0002*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0014\b\u0001\u0010\u0004*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0006\u001a\u0002H\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "M", "Lcom/squareup/wire/Message;", "B", "Lcom/squareup/wire/Message$Builder;", "builder", "invoke", "(Lcom/squareup/wire/Message$Builder;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.squareup.wire.internal.FieldBinding$getBuilderGetter$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC3864v implements l<B, Object> {
        final /* synthetic */ Field $field;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Field field) {
            super(1);
            this.$field = field;
        }

        @Override // Ba.l
        public final Object invoke(B builder) {
            C3862t.g(builder, "builder");
            return this.$field.get(builder);
        }
    }

    /* compiled from: FieldBinding.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\u00020\u0007\"\u0014\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\"\u0014\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0004\u001a\u00028\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/squareup/wire/Message;", "M", "Lcom/squareup/wire/Message$Builder;", "B", "builder", "", "value", "Loa/F;", "invoke", "(Lcom/squareup/wire/Message$Builder;Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.squareup.wire.internal.FieldBinding$getBuilderSetter$1, reason: invalid class name and case insensitive filesystem */
    static final class C29851 extends AbstractC3864v implements p<B, Object, C4153F> {
        final /* synthetic */ WireField $wireField;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C29851(WireField wireField) {
            super(2);
            this.$wireField = wireField;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(Object obj, Object obj2) {
            invoke((C29851) obj, obj2);
            return C4153F.f46609a;
        }

        public final void invoke(B builder, Object obj) {
            C3862t.g(builder, "builder");
            ((KotlinConstructorBuilder) builder).set(this.$wireField, obj);
        }
    }

    /* compiled from: FieldBinding.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\u00020\u0007\"\u0014\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\"\u0014\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0004\u001a\u00028\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/squareup/wire/Message;", "M", "Lcom/squareup/wire/Message$Builder;", "B", "builder", "", "value", "Loa/F;", "invoke", "(Lcom/squareup/wire/Message$Builder;Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.squareup.wire.internal.FieldBinding$getBuilderSetter$2, reason: invalid class name and case insensitive filesystem */
    static final class C29862 extends AbstractC3864v implements p<B, Object, C4153F> {
        final /* synthetic */ Method $method;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C29862(Method method) {
            super(2);
            this.$method = method;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(Object obj, Object obj2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            invoke((C29862) obj, obj2);
            return C4153F.f46609a;
        }

        public final void invoke(B builder, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            C3862t.g(builder, "builder");
            this.$method.invoke(builder, obj);
        }
    }

    /* compiled from: FieldBinding.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\u00020\u0007\"\u0014\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\"\u0014\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0004\u001a\u00028\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/squareup/wire/Message;", "M", "Lcom/squareup/wire/Message$Builder;", "B", "builder", "", "value", "Loa/F;", "invoke", "(Lcom/squareup/wire/Message$Builder;Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.squareup.wire.internal.FieldBinding$getBuilderSetter$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC3864v implements p<B, Object, C4153F> {
        final /* synthetic */ Field $field;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(Field field) {
            super(2);
            this.$field = field;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(Object obj, Object obj2) throws IllegalAccessException, IllegalArgumentException {
            invoke((AnonymousClass3) obj, obj2);
            return C4153F.f46609a;
        }

        public final void invoke(B builder, Object obj) throws IllegalAccessException, IllegalArgumentException {
            C3862t.g(builder, "builder");
            this.$field.set(builder, obj);
        }
    }

    /* compiled from: FieldBinding.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\u0014\b\u0000\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0014\b\u0001\u0010\u0005*\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00050\u00062\u0006\u0010\u0007\u001a\u0002H\u0003H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "M", "Lcom/squareup/wire/Message;", "B", "Lcom/squareup/wire/Message$Builder;", "instance", "invoke", "(Lcom/squareup/wire/Message;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.squareup.wire.internal.FieldBinding$getInstanceGetter$1, reason: invalid class name and case insensitive filesystem */
    static final class C29871 extends AbstractC3864v implements l<M, Object> {
        final /* synthetic */ Method $getter;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C29871(Method method) {
            super(1);
            this.$getter = method;
        }

        @Override // Ba.l
        public final Object invoke(M instance) {
            C3862t.g(instance, "instance");
            return this.$getter.invoke(instance, null);
        }
    }

    /* compiled from: FieldBinding.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\u0014\b\u0000\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0014\b\u0001\u0010\u0005*\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00050\u00062\u0006\u0010\u0007\u001a\u0002H\u0003H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "M", "Lcom/squareup/wire/Message;", "B", "Lcom/squareup/wire/Message$Builder;", "instance", "invoke", "(Lcom/squareup/wire/Message;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.squareup.wire.internal.FieldBinding$getInstanceGetter$2, reason: invalid class name and case insensitive filesystem */
    static final class C29882 extends AbstractC3864v implements l<M, Object> {
        final /* synthetic */ FieldBinding<M, B> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C29882(FieldBinding<M, B> fieldBinding) {
            super(1);
            this.this$0 = fieldBinding;
        }

        @Override // Ba.l
        public final Object invoke(M instance) {
            C3862t.g(instance, "instance");
            return ((FieldBinding) this.this$0).messageField.get(instance);
        }
    }

    public /* synthetic */ FieldBinding(WireField wireField, Class cls, Field field, Class cls2, boolean z10, ClassLoader classLoader, int i10, C3854k c3854k) {
        this(wireField, cls, field, cls2, z10, (i10 & 32) != 0 ? cls.getClassLoader() : classLoader);
    }

    private final l<B, Object> getBuilderGetter(Class<?> builderType, WireField wireField) {
        if (builderType.isAssignableFrom(KotlinConstructorBuilder.class)) {
            return new AnonymousClass1(wireField);
        }
        try {
            return new AnonymousClass2(builderType.getField(getName()));
        } catch (NoSuchFieldException unused) {
            throw new AssertionError("No builder field " + builderType.getName() + '.' + getName());
        }
    }

    private final p<B, Object, C4153F> getBuilderSetter(Class<?> builderType, WireField wireField) {
        p<B, Object, C4153F> anonymousClass3;
        if (builderType.isAssignableFrom(KotlinConstructorBuilder.class)) {
            return new C29851(wireField);
        }
        if (wireField.label().isOneOf()) {
            Class<?> type = this.messageField.getType();
            try {
                anonymousClass3 = new C29862(builderType.getMethod(getName(), type));
            } catch (NoSuchMethodException unused) {
                throw new AssertionError("No builder method " + builderType.getName() + '.' + getName() + '(' + type.getName() + ')');
            }
        } else {
            try {
                anonymousClass3 = new AnonymousClass3(builderType.getField(getName()));
            } catch (NoSuchFieldException unused2) {
                throw new AssertionError("No builder field " + builderType.getName() + '.' + getName());
            }
        }
        return anonymousClass3;
    }

    private final l<M, Object> getInstanceGetter(Class<M> messageType) {
        if (!Modifier.isPrivate(this.messageField.getModifiers())) {
            return new C29882(this);
        }
        String name = this.messageField.getName();
        k kVar = IS_GETTER_FIELD_NAME_REGEX;
        C3862t.d(name);
        if (!kVar.b(name)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("get");
            if (name.length() > 0) {
                StringBuilder sb3 = new StringBuilder();
                String strValueOf = String.valueOf(name.charAt(0));
                C3862t.e(strValueOf, "null cannot be cast to non-null type java.lang.String");
                String upperCase = strValueOf.toUpperCase(Locale.ROOT);
                C3862t.f(upperCase, "toUpperCase(...)");
                sb3.append((Object) upperCase);
                String strSubstring = name.substring(1);
                C3862t.f(strSubstring, "substring(...)");
                sb3.append(strSubstring);
                name = sb3.toString();
            }
            sb2.append(name);
            name = sb2.toString();
        }
        return new C29871(messageType.getMethod(name, null));
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public String getDeclaredName() {
        return this.declaredName;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public ProtoAdapter<?> getKeyAdapter() {
        return ProtoAdapter.INSTANCE.get(this.keyAdapterString, this.classLoader);
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public WireField.Label getLabel() {
        return this.label;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public String getName() {
        return this.name;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public boolean getRedacted() {
        return this.redacted;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public ProtoAdapter<?> getSingleAdapter() {
        return ProtoAdapter.INSTANCE.get(this.adapterString, this.classLoader);
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public int getTag() {
        return this.tag;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public String getWireFieldJsonName() {
        return this.wireFieldJsonName;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public boolean getWriteIdentityValues() {
        return this.writeIdentityValues;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public boolean isMap() {
        return this.keyAdapterString.length() > 0;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public boolean isMessage() {
        d<?> type = getSingleAdapter().getType();
        Class clsC = type != null ? a.c(type) : null;
        C3862t.d(clsC);
        return Message.class.isAssignableFrom(clsC);
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public Object get(M message) {
        C3862t.g(message, "message");
        return this.instanceGetter.invoke(message);
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public Object getFromBuilder(B builder) {
        C3862t.g(builder, "builder");
        return this.builderGetter.invoke(builder);
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public void set(B builder, Object value) {
        C3862t.g(builder, "builder");
        this.builderSetter.invoke(builder, value);
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public void value(B builder, Object value) {
        C3862t.g(builder, "builder");
        C3862t.g(value, "value");
        if (getLabel().isRepeated()) {
            Object fromBuilder = getFromBuilder((FieldBinding<M, B>) builder);
            if (W.n(fromBuilder)) {
                C3862t.e(fromBuilder, "null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.Any>");
                W.c(fromBuilder).add(value);
                return;
            } else if (fromBuilder instanceof List) {
                List listZ0 = r.Z0((Collection) fromBuilder);
                listZ0.add(value);
                set((FieldBinding<M, B>) builder, (Object) listZ0);
                return;
            } else {
                throw new ClassCastException("Expected a list type, got " + (fromBuilder != null ? fromBuilder.getClass() : null) + '.');
            }
        }
        if (this.keyAdapterString.length() <= 0) {
            set((FieldBinding<M, B>) builder, value);
            return;
        }
        Object fromBuilder2 = getFromBuilder((FieldBinding<M, B>) builder);
        if (W.o(fromBuilder2)) {
            ((Map) fromBuilder2).putAll((Map) value);
            return;
        }
        if (fromBuilder2 instanceof Map) {
            Map mapT = M.t((Map) fromBuilder2);
            mapT.putAll((Map) value);
            set((FieldBinding<M, B>) builder, (Object) mapT);
        } else {
            throw new ClassCastException("Expected a map type, got " + (fromBuilder2 != null ? fromBuilder2.getClass() : null) + '.');
        }
    }

    public FieldBinding(WireField wireField, Class<M> messageType, Field messageField, Class<B> builderType, boolean z10, ClassLoader classLoader) {
        String strDeclaredName;
        C3862t.g(wireField, "wireField");
        C3862t.g(messageType, "messageType");
        C3862t.g(messageField, "messageField");
        C3862t.g(builderType, "builderType");
        this.messageField = messageField;
        this.writeIdentityValues = z10;
        this.classLoader = classLoader;
        this.label = wireField.label();
        String name = messageField.getName();
        C3862t.f(name, "getName(...)");
        this.name = name;
        this.wireFieldJsonName = wireField.jsonName();
        if (wireField.declaredName().length() == 0) {
            strDeclaredName = messageField.getName();
            C3862t.f(strDeclaredName, "getName(...)");
        } else {
            strDeclaredName = wireField.declaredName();
        }
        this.declaredName = strDeclaredName;
        this.tag = wireField.tag();
        this.keyAdapterString = wireField.keyAdapter();
        this.adapterString = wireField.adapter();
        this.redacted = wireField.redacted();
        this.builderSetter = getBuilderSetter(builderType, wireField);
        this.builderGetter = getBuilderGetter(builderType, wireField);
        this.instanceGetter = getInstanceGetter(messageType);
    }
}
