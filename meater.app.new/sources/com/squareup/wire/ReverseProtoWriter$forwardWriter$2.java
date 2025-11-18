package com.squareup.wire;

import Ba.a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;

/* compiled from: ReverseProtoWriter.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/squareup/wire/ProtoWriter;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ReverseProtoWriter$forwardWriter$2 extends AbstractC3864v implements a<ProtoWriter> {
    final /* synthetic */ ReverseProtoWriter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReverseProtoWriter$forwardWriter$2(ReverseProtoWriter reverseProtoWriter) {
        super(0);
        this.this$0 = reverseProtoWriter;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // Ba.a
    public final ProtoWriter invoke() {
        return new ProtoWriter(this.this$0.getForwardBuffer());
    }
}
