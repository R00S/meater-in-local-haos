package v5;

import androidx.recyclerview.widget.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import o4.Recipe;

/* compiled from: RecipeDiffCallback.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0010J!\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0017R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017¨\u0006\u0018"}, d2 = {"Lv5/m;", "Landroidx/recyclerview/widget/h$b;", "", "Lo4/o;", "oldList", "newList", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "e", "()I", "d", "oldItemPosition", "newItemPosition", "", "b", "(II)Z", "oldPosition", "newPosition", "a", "", "c", "(II)Ljava/lang/Object;", "Ljava/util/List;", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class m extends h.b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<Recipe> oldList;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<Recipe> newList;

    public m(List<Recipe> oldList, List<Recipe> newList) {
        C3862t.g(oldList, "oldList");
        C3862t.g(newList, "newList");
        this.oldList = oldList;
        this.newList = newList;
    }

    @Override // androidx.recyclerview.widget.h.b
    public boolean a(int oldPosition, int newPosition) {
        Recipe recipe = this.oldList.get(oldPosition);
        int schemaVersion = recipe.getSchemaVersion();
        String title = recipe.getTitle();
        Recipe recipe2 = this.newList.get(newPosition);
        return C3862t.b(title, recipe2.getTitle()) && schemaVersion == recipe2.getSchemaVersion();
    }

    @Override // androidx.recyclerview.widget.h.b
    public boolean b(int oldItemPosition, int newItemPosition) {
        return this.oldList.get(oldItemPosition).getId() == this.newList.get(newItemPosition).getId();
    }

    @Override // androidx.recyclerview.widget.h.b
    public Object c(int oldPosition, int newPosition) {
        return super.c(oldPosition, newPosition);
    }

    @Override // androidx.recyclerview.widget.h.b
    public int d() {
        return this.newList.size();
    }

    @Override // androidx.recyclerview.widget.h.b
    public int e() {
        return this.oldList.size();
    }
}
