package io.reactivex.exceptions;

/* compiled from: Exceptions.java */
/* renamed from: io.reactivex.exceptions.a */
/* loaded from: classes2.dex */
public final class C9240a {
    /* renamed from: a */
    public static void m30000a(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }
}
