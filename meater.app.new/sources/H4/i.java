package H4;

import ac.InterfaceC1970e;
import java.util.List;
import kotlin.Metadata;

/* compiled from: OnGoingRecipeDAO.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000b\u001a\u00020\u00062\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\t\"\u00020\u0004H'¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\rH'¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\rH'¢\u0006\u0004\b\u0012\u0010\u0010J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0014\u001a\u00020\u0013H'¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00172\u0006\u0010\u0014\u001a\u00020\u0013H'¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001a\u001a\u00020\u0013H'¢\u0006\u0004\b\u001b\u0010\u0016J\u0017\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0013H'¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H'¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040 H'¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00040 H'¢\u0006\u0004\b#\u0010\"¨\u0006$"}, d2 = {"LH4/i;", "", "<init>", "()V", "LK4/b;", "savedEventLog", "Loa/F;", "j", "(LK4/b;)V", "", "onGoingRecipeInfo", "k", "([LK4/b;)V", "", "id", "f", "(I)LK4/b;", "recipeId", "d", "", "ongoingRecipeId", "g", "(J)LK4/b;", "Lac/e;", "h", "(J)Lac/e;", "deviceId", "e", "i", "(J)I", "a", "(J)V", "", "b", "()Ljava/util/List;", "c", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class i {
    public abstract void a(long ongoingRecipeId);

    public abstract List<K4.b> b();

    public abstract List<K4.b> c();

    public abstract K4.b d(int recipeId);

    public abstract K4.b e(long deviceId);

    public abstract K4.b f(int id2);

    public abstract K4.b g(long ongoingRecipeId);

    public abstract InterfaceC1970e<K4.b> h(long ongoingRecipeId);

    public abstract int i(long ongoingRecipeId);

    public abstract void j(K4.b savedEventLog);

    public abstract void k(K4.b... onGoingRecipeInfo);
}
