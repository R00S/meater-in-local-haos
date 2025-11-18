package cm.aptoide.p092pt.share;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import androidx.appcompat.app.DialogInterfaceC0066c;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.networking.image.ImageLoader;
import com.bumptech.glide.p141p.p142l.AbstractC5575g;
import com.bumptech.glide.p141p.p143m.InterfaceC5582d;
import p456rx.AbstractC11245j;
import p456rx.C11234e;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p474t.C11429e;

/* loaded from: classes.dex */
public class ShareDialogs {

    public enum ShareResponse {
        USING
    }

    public static C11234e<ShareResponse> createStoreShareDialog(final Context context, final String str, final String str2) {
        return C11234e.m40048l(new C11234e.a() { // from class: cm.aptoide.pt.share.c
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                ShareDialogs.lambda$createStoreShareDialog$2(context, str, str2, (AbstractC11245j) obj);
            }
        });
    }

    static /* synthetic */ void lambda$createStoreShareDialog$0(AbstractC11245j abstractC11245j, DialogInterface dialogInterface, int i2) {
        if (abstractC11245j.isUnsubscribed() || i2 != 0) {
            return;
        }
        abstractC11245j.onNext(ShareResponse.USING);
        abstractC11245j.onCompleted();
    }

    static /* synthetic */ void lambda$createStoreShareDialog$2(Context context, String str, String str2, final AbstractC11245j abstractC11245j) {
        final DialogInterfaceC0066c dialogInterfaceC0066cM244a = new DialogInterfaceC0066c.a(context).m265v(str).m251h(C1146R.array.store_share_options_array, new DialogInterface.OnClickListener() { // from class: cm.aptoide.pt.share.a
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                ShareDialogs.lambda$createStoreShareDialog$0(abstractC11245j, dialogInterface, i2);
            }
        }).m244a();
        ImageLoader.with(context).loadIntoTarget(str2, new AbstractC5575g<Drawable>() { // from class: cm.aptoide.pt.share.ShareDialogs.1
            @Override // com.bumptech.glide.p141p.p142l.InterfaceC5577i
            public /* bridge */ /* synthetic */ void onResourceReady(Object obj, InterfaceC5582d interfaceC5582d) {
                onResourceReady((Drawable) obj, (InterfaceC5582d<? super Drawable>) interfaceC5582d);
            }

            public void onResourceReady(Drawable drawable, InterfaceC5582d<? super Drawable> interfaceC5582d) {
                dialogInterfaceC0066cM244a.m243h(drawable);
            }
        });
        abstractC11245j.add(C11429e.m40674a(new InterfaceC11252a() { // from class: cm.aptoide.pt.share.b
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                dialogInterfaceC0066cM244a.dismiss();
            }
        }));
        dialogInterfaceC0066cM244a.show();
    }
}
