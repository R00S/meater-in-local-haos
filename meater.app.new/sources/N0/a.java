package N0;

import O0.r;
import O0.s;
import android.os.LocaleList;
import android.util.Log;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: AndroidLocaleDelegate.android.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tR\u0018\u0010\r\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0015¨\u0006\u0017"}, d2 = {"LN0/a;", "LN0/f;", "<init>", "()V", "", "languageTag", "Ljava/util/Locale;", "Landroidx/compose/ui/text/intl/PlatformLocale;", "c", "(Ljava/lang/String;)Ljava/util/Locale;", "Landroid/os/LocaleList;", "a", "Landroid/os/LocaleList;", "lastPlatformLocaleList", "LN0/e;", "b", "LN0/e;", "lastLocaleList", "LO0/s;", "LO0/s;", "lock", "()LN0/e;", "current", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a implements f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private LocaleList lastPlatformLocaleList;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private LocaleList lastLocaleList;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final s lock = r.a();

    @Override // N0.f
    public LocaleList b() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (this.lock) {
            LocaleList localeList2 = this.lastLocaleList;
            if (localeList2 != null && localeList == this.lastPlatformLocaleList) {
                return localeList2;
            }
            int size = localeList.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(new d(localeList.get(i10)));
            }
            LocaleList localeList3 = new LocaleList(arrayList);
            this.lastPlatformLocaleList = localeList;
            this.lastLocaleList = localeList3;
            return localeList3;
        }
    }

    @Override // N0.f
    public Locale c(String languageTag) {
        Locale localeForLanguageTag = Locale.forLanguageTag(languageTag);
        if (C3862t.b(localeForLanguageTag.toLanguageTag(), "und")) {
            Log.e(b.f12218a, "The language tag " + languageTag + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
        }
        return localeForLanguageTag;
    }
}
