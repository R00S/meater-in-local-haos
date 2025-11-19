package com.squareup.wire.internal;

import Ba.a;
import com.squareup.wire.KotlinConstructorBuilder;
import com.squareup.wire.Message;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;

/* JADX INFO: Add missing generic type declarations: [B] */
/* compiled from: reflection.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0014\b\u0000\u0010\u0002*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\u0003\"\u0014\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "B", "M", "Lcom/squareup/wire/Message;", "Lcom/squareup/wire/Message$Builder;", "invoke", "()Lcom/squareup/wire/Message$Builder;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ReflectionKt$createRuntimeMessageAdapter$newBuilderInstance$1<B> extends AbstractC3864v implements a<B> {
    final /* synthetic */ Class<B> $builderType;
    final /* synthetic */ Class<M> $messageType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReflectionKt$createRuntimeMessageAdapter$newBuilderInstance$1(Class<B> cls, Class<M> cls2) {
        super(0);
        this.$builderType = cls;
        this.$messageType = cls2;
    }

    /* JADX WARN: Incorrect return type in method signature: ()TB; */
    @Override // Ba.a
    public final Message.Builder invoke() throws IllegalAccessException, InstantiationException {
        if (this.$builderType.isAssignableFrom(KotlinConstructorBuilder.class)) {
            return new KotlinConstructorBuilder(this.$messageType);
        }
        B bNewInstance = this.$builderType.newInstance();
        C3862t.d(bNewInstance);
        return (Message.Builder) bNewInstance;
    }
}
