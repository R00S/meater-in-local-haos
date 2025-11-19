package v3;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import u3.InterfaceC4670h;

/* compiled from: FrameworkSQLiteOpenHelperFactory.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lv3/f;", "Lu3/h$c;", "<init>", "()V", "Lu3/h$b;", "configuration", "Lu3/h;", "a", "(Lu3/h$b;)Lu3/h;", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: v3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4819f implements InterfaceC4670h.c {
    @Override // u3.InterfaceC4670h.c
    public InterfaceC4670h a(InterfaceC4670h.b configuration) {
        C3862t.g(configuration, "configuration");
        return new C4817d(configuration.context, configuration.name, configuration.callback, configuration.useNoBackupDirectory, configuration.allowDataLossOnRecovery);
    }
}
