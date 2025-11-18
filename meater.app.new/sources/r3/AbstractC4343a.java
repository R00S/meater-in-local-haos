package r3;

import kotlin.Metadata;
import u3.InterfaceC4669g;

/* compiled from: Migration.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\f¨\u0006\r"}, d2 = {"Lr3/a;", "", "", "startVersion", "endVersion", "<init>", "(II)V", "Lu3/g;", "db", "Loa/F;", "migrate", "(Lu3/g;)V", "I", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: r3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4343a {
    public final int endVersion;
    public final int startVersion;

    public AbstractC4343a(int i10, int i11) {
        this.startVersion = i10;
        this.endVersion = i11;
    }

    public abstract void migrate(InterfaceC4669g db2);
}
