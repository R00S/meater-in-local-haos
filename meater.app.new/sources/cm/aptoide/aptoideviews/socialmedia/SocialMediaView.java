package cm.aptoide.aptoideviews.socialmedia;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import cm.aptoide.aptoideviews.C1103R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;
import p241e.p294g.p295a.p304c.C8975a;
import p456rx.C11234e;
import p456rx.p460m.InterfaceC11256e;

/* compiled from: SocialMediaView.kt */
@Metadata(m32266d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u000eB\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¨\u0006\u000f"}, m32267d2 = {"Lcm/aptoide/aptoideviews/socialmedia/SocialMediaView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "onFacebookClicked", "Lrx/Observable;", "Lcm/aptoide/aptoideviews/socialmedia/SocialMediaView$SocialMediaType;", "onInstagramClicked", "onSocialMediaClick", "onTikTokClicked", "onTwitterClicked", "SocialMediaType", "aptoide-views_prodRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class SocialMediaView extends FrameLayout {
    public Map<Integer, View> _$_findViewCache;

    /* compiled from: SocialMediaView.kt */
    @Metadata(m32266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m32267d2 = {"Lcm/aptoide/aptoideviews/socialmedia/SocialMediaView$SocialMediaType;", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;I)V", "INSTAGRAM_CLICK", "TWITTER_CLICK", "FACEBOOK_CLICK", "TIKTOK_CLICK", "aptoide-views_prodRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    public enum SocialMediaType {
        INSTAGRAM_CLICK,
        TWITTER_CLICK,
        FACEBOOK_CLICK,
        TIKTOK_CLICK
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SocialMediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C9801m.m32346f(context, "context");
        C9801m.m32346f(attributeSet, "attrs");
        this._$_findViewCache = new LinkedHashMap();
        FrameLayout.inflate(context, C1103R.layout.social_media_view, this);
    }

    private final C11234e<SocialMediaType> onFacebookClicked() {
        C11234e c11234eM40082X = C8975a.m28573a((ImageView) _$_findCachedViewById(C1103R.id.facebook_button)).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.aptoideviews.socialmedia.d
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return SocialMediaView.m40685onFacebookClicked$lambda0((Void) obj);
            }
        });
        C9801m.m32345e(c11234eM40082X, "clicks(facebook_button).…ediaType.FACEBOOK_CLICK }");
        return c11234eM40082X;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onFacebookClicked$lambda-0, reason: not valid java name */
    public static final SocialMediaType m40685onFacebookClicked$lambda0(Void r0) {
        return SocialMediaType.FACEBOOK_CLICK;
    }

    private final C11234e<SocialMediaType> onInstagramClicked() {
        C11234e c11234eM40082X = C8975a.m28573a((ImageView) _$_findCachedViewById(C1103R.id.instagram_button)).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.aptoideviews.socialmedia.c
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return SocialMediaView.m40686onInstagramClicked$lambda1((Void) obj);
            }
        });
        C9801m.m32345e(c11234eM40082X, "clicks(instagram_button)…diaType.INSTAGRAM_CLICK }");
        return c11234eM40082X;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onInstagramClicked$lambda-1, reason: not valid java name */
    public static final SocialMediaType m40686onInstagramClicked$lambda1(Void r0) {
        return SocialMediaType.INSTAGRAM_CLICK;
    }

    private final C11234e<SocialMediaType> onTikTokClicked() {
        C11234e c11234eM40082X = C8975a.m28573a((ImageView) _$_findCachedViewById(C1103R.id.tiktok_button)).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.aptoideviews.socialmedia.a
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return SocialMediaView.m40687onTikTokClicked$lambda3((Void) obj);
            }
        });
        C9801m.m32345e(c11234eM40082X, "clicks(tiktok_button).ma…lMediaType.TIKTOK_CLICK }");
        return c11234eM40082X;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onTikTokClicked$lambda-3, reason: not valid java name */
    public static final SocialMediaType m40687onTikTokClicked$lambda3(Void r0) {
        return SocialMediaType.TIKTOK_CLICK;
    }

    private final C11234e<SocialMediaType> onTwitterClicked() {
        C11234e c11234eM40082X = C8975a.m28573a((ImageView) _$_findCachedViewById(C1103R.id.twitter_button)).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.aptoideviews.socialmedia.b
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return SocialMediaView.m40688onTwitterClicked$lambda2((Void) obj);
            }
        });
        C9801m.m32345e(c11234eM40082X, "clicks(twitter_button).m…MediaType.TWITTER_CLICK }");
        return c11234eM40082X;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onTwitterClicked$lambda-2, reason: not valid java name */
    public static final SocialMediaType m40688onTwitterClicked$lambda2(Void r0) {
        return SocialMediaType.TWITTER_CLICK;
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i2) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i2);
        if (viewFindViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i2), viewFindViewById);
        return viewFindViewById;
    }

    public final C11234e<SocialMediaType> onSocialMediaClick() {
        C11234e<SocialMediaType> c11234eM40037c0 = C11234e.m40037c0(onFacebookClicked(), onInstagramClicked(), onTwitterClicked(), onTikTokClicked());
        C9801m.m32345e(c11234eM40037c0, "merge(\n      onFacebookC…  onTikTokClicked()\n    )");
        return c11234eM40037c0;
    }
}
