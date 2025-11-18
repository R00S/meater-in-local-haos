package androidx.room.p009s;

import p024c.p082u.p083a.InterfaceC1008b;

/* compiled from: Migration.java */
/* renamed from: androidx.room.s.a */
/* loaded from: classes.dex */
public abstract class AbstractC0660a {
    public final int endVersion;
    public final int startVersion;

    public AbstractC0660a(int i2, int i3) {
        this.startVersion = i2;
        this.endVersion = i3;
    }

    public abstract void migrate(InterfaceC1008b interfaceC1008b);
}
