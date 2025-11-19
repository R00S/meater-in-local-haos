package com.squareup.wire.internal;

import Ba.a;
import com.squareup.wire.ProtoAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;

/* compiled from: FieldOrOneOfBinding.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/squareup/wire/ProtoAdapter;", "", "M", "B", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class FieldOrOneOfBinding$adapter$2 extends AbstractC3864v implements a<ProtoAdapter<Object>> {
    final /* synthetic */ FieldOrOneOfBinding<M, B> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FieldOrOneOfBinding$adapter$2(FieldOrOneOfBinding<M, B> fieldOrOneOfBinding) {
        super(0);
        this.this$0 = fieldOrOneOfBinding;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // Ba.a
    public final ProtoAdapter<Object> invoke() {
        if (!this.this$0.isMap()) {
            ProtoAdapter<?> protoAdapterWithLabel$wire_runtime = this.this$0.getSingleAdapter().withLabel$wire_runtime(this.this$0.getLabel());
            C3862t.e(protoAdapterWithLabel$wire_runtime, "null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>");
            return protoAdapterWithLabel$wire_runtime;
        }
        ProtoAdapter.Companion companion = ProtoAdapter.INSTANCE;
        ProtoAdapter<?> keyAdapter = this.this$0.getKeyAdapter();
        C3862t.e(keyAdapter, "null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>");
        ProtoAdapter<?> singleAdapter = this.this$0.getSingleAdapter();
        C3862t.e(singleAdapter, "null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>");
        ProtoAdapter<Object> protoAdapterNewMapAdapter = companion.newMapAdapter(keyAdapter, singleAdapter);
        C3862t.e(protoAdapterNewMapAdapter, "null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>");
        return protoAdapterNewMapAdapter;
    }
}
