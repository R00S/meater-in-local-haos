package M0;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import oa.InterfaceC4156a;

/* compiled from: TextInputService.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R(\u0010\f\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010\bj\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"LM0/G;", "", "LM0/z;", "platformTextInputService", "<init>", "(LM0/z;)V", "a", "LM0/z;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/ui/text/AtomicReference;", "b", "Ljava/util/concurrent/atomic/AtomicReference;", "_currentInputSession", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC4156a
/* loaded from: classes.dex */
public class G {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final z platformTextInputService;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AtomicReference<Object> _currentInputSession = new AtomicReference<>(null);

    public G(z zVar) {
        this.platformTextInputService = zVar;
    }
}
