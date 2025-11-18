package A0;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import x0.C5047a;

/* compiled from: NodeKind.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\u0003R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR$\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\f\u0010\u0006\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"LA0/e;", "Landroidx/compose/ui/focus/g;", "<init>", "()V", "", "a", "()Z", "Loa/F;", "b", "Ljava/lang/Boolean;", "canFocusValue", "value", "q", "y", "(Z)V", "canFocus", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: A0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0826e implements androidx.compose.ui.focus.g {

    /* renamed from: a, reason: collision with root package name */
    public static final C0826e f600a = new C0826e();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static Boolean canFocusValue;

    private C0826e() {
    }

    public final boolean a() {
        return canFocusValue != null;
    }

    public final void b() {
        canFocusValue = null;
    }

    @Override // androidx.compose.ui.focus.g
    public boolean q() {
        Boolean bool = canFocusValue;
        if (bool != null) {
            return bool.booleanValue();
        }
        C5047a.c("canFocus is read before it is written");
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.ui.focus.g
    public void y(boolean z10) {
        canFocusValue = Boolean.valueOf(z10);
    }
}
