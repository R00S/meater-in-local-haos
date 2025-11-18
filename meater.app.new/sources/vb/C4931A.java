package vb;

import Hb.U;
import Ra.H;
import java.util.List;
import kotlin.jvm.internal.C3862t;

/* compiled from: constantValues.kt */
/* renamed from: vb.A, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4931A extends C4938b {

    /* renamed from: c, reason: collision with root package name */
    private final U f51595c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4931A(List<? extends AbstractC4943g<?>> value, U type) {
        super(value, new z(type));
        C3862t.g(value, "value");
        C3862t.g(type, "type");
        this.f51595c = type;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final U c(U u10, H it) {
        C3862t.g(it, "it");
        return u10;
    }

    public final U e() {
        return this.f51595c;
    }
}
