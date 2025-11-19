package v5;

import L4.Y0;
import U1.B;
import U1.v;
import Xb.C1841i;
import Xb.C1854o0;
import Xb.I;
import Xb.InterfaceC1867v0;
import Xb.Z;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.common.PlaybackException;
import androidx.media3.datasource.cache.a;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.source.C;
import androidx.media3.ui.PlayerView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import com.apptionlabs.meater_app.R;
import com.bumptech.glide.load.engine.GlideException;
import d2.C3032d;
import d2.H;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import m6.EnumC3966a;
import o4.EnumC4130e;
import o4.Recipe;
import o4.r;
import oa.C4153F;
import oa.C4170o;
import oa.C4173r;
import ta.InterfaceC4588d;
import ua.C4696b;
import v5.l;

/* compiled from: RecipeBrowseAdapter.kt */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u00012\u00020\u00032\u00020\u0004:\u0002lmB\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0006JA\u0010\u0015\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0003¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010#\u001a\u00020\"2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u001dH\u0003¢\u0006\u0004\b#\u0010$J%\u0010)\u001a\u00020\u00072\u0016\u0010(\u001a\u0012\u0012\u0004\u0012\u00020&0%j\b\u0012\u0004\u0012\u00020&`'¢\u0006\u0004\b)\u0010*J\u001f\u0010.\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u00112\b\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b.\u0010/J\u0015\u00102\u001a\u00020\u00072\u0006\u00101\u001a\u000200¢\u0006\u0004\b2\u00103J#\u00107\u001a\u00060\u0002R\u00020\u00002\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u00020\tH\u0016¢\u0006\u0004\b7\u00108J#\u0010;\u001a\u00020\u00072\n\u00109\u001a\u00060\u0002R\u00020\u00002\u0006\u0010:\u001a\u00020\tH\u0016¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\tH\u0016¢\u0006\u0004\b=\u0010>J\u0017\u0010A\u001a\u00020\u00072\b\u0010@\u001a\u0004\u0018\u00010?¢\u0006\u0004\bA\u0010BJ\u0017\u0010D\u001a\u00020C2\u0006\u0010:\u001a\u00020\tH\u0016¢\u0006\u0004\bD\u0010EJ\u001b\u0010G\u001a\u00020\u00072\n\u0010F\u001a\u00060\u0002R\u00020\u0000H\u0016¢\u0006\u0004\bG\u0010HJ+\u0010I\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\n\u00109\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\bI\u0010JJ\u000f\u0010L\u001a\u00020KH\u0016¢\u0006\u0004\bL\u0010MJ\r\u0010N\u001a\u00020\u0007¢\u0006\u0004\bN\u0010\u0006J\u0015\u0010O\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\bO\u0010PR\u0016\u0010S\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0018\u0010@\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR&\u0010X\u001a\u0012\u0012\u0004\u0012\u00020&0%j\b\u0012\u0004\u0012\u00020&`'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR&\u0010Z\u001a\u0012\u0012\u0004\u0012\u00020&0%j\b\u0012\u0004\u0012\u00020&`'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010WR\u0018\u0010]\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\"\u0010a\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001d0^8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R$\u0010e\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR$\u0010g\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010dR\u0018\u0010k\u001a\u0004\u0018\u00010h8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010j¨\u0006n"}, d2 = {"Lv5/l;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lv5/l$a;", "", "Landroid/widget/Filterable;", "<init>", "()V", "Loa/F;", "V", "", "index", "Landroid/widget/ProgressBar;", "progressbar", "Landroid/widget/ImageView;", "thumbnail", "Landroidx/media3/ui/PlayerView;", "playerView", "", "videoUrl", "Landroidx/media3/datasource/cache/a$c;", "cacheDir", "b0", "(ILandroid/widget/ProgressBar;Landroid/widget/ImageView;Landroidx/media3/ui/PlayerView;Ljava/lang/String;Landroidx/media3/datasource/cache/a$c;)V", "e0", "(Landroidx/media3/ui/PlayerView;Landroid/widget/ImageView;)V", "Landroidx/media3/exoplayer/ExoPlayer$b;", "playerBuilder", "Landroid/content/Context;", "context", "", "preferExtensionDecoders", "d0", "(Landroidx/media3/exoplayer/ExoPlayer$b;Landroid/content/Context;Z)V", "preferExtensionRenderer", "Ld2/H;", "R", "(Landroid/content/Context;Z)Ld2/H;", "Ljava/util/ArrayList;", "Lo4/o;", "Lkotlin/collections/ArrayList;", "newList", "c0", "(Ljava/util/ArrayList;)V", "tag", "", "query", "Q", "(Ljava/lang/String;Ljava/lang/CharSequence;)V", "Lw5/f;", "listener", "a0", "(Lw5/f;)V", "Landroid/view/ViewGroup;", "parent", "viewType", "T", "(Landroid/view/ViewGroup;I)Lv5/l$a;", "viewHolder", "position", "S", "(Lv5/l$a;I)V", "h", "()I", "Lv5/l$b;", "clickListener", "Z", "(Lv5/l$b;)V", "", "i", "(I)J", "holder", "U", "(Lv5/l$a;)V", "W", "(ILv5/l$a;Landroidx/media3/datasource/cache/a$c;)V", "Landroid/widget/Filter;", "getFilter", "()Landroid/widget/Filter;", "X", "Y", "(I)V", "E", "Ljava/lang/String;", "selectedTag", "F", "Lv5/l$b;", "G", "Ljava/util/ArrayList;", "recipeList", "H", "recipeListFiltered", "I", "Lw5/f;", "searchFilterCallback", "", "J", "Ljava/util/Map;", "imageLoadCompletionMap", "Loa/o;", "K", "Loa/o;", "currentPlayingVideo", "L", "currentPlayerThumbnail", "LXb/v0;", "M", "LXb/v0;", "playerJob", "a", "b", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class l extends RecyclerView.h<a> implements Filterable {

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private b clickListener;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    private w5.f searchFilterCallback;

    /* renamed from: K, reason: collision with root package name and from kotlin metadata */
    private C4170o<Integer, ? extends PlayerView> currentPlayingVideo;

    /* renamed from: L, reason: collision with root package name and from kotlin metadata */
    private C4170o<Integer, ? extends ImageView> currentPlayerThumbnail;

    /* renamed from: M, reason: collision with root package name and from kotlin metadata */
    private InterfaceC1867v0 playerJob;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private String selectedTag = "all";

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private ArrayList<Recipe> recipeList = new ArrayList<>();

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private ArrayList<Recipe> recipeListFiltered = new ArrayList<>();

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    private Map<Integer, Boolean> imageLoadCompletionMap = new LinkedHashMap();

    /* compiled from: RecipeBrowseAdapter.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\fR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lv5/l$a;", "Landroidx/recyclerview/widget/RecyclerView$G;", "Landroid/view/View;", "itemView", "LL4/Y0;", "adapterBinding", "<init>", "(Lv5/l;Landroid/view/View;LL4/Y0;)V", "Lo4/o;", "data", "Loa/F;", "d", "(Lo4/o;)V", "b", "B", "LL4/Y0;", "getAdapterBinding", "()LL4/Y0;", "setAdapterBinding", "(LL4/Y0;)V", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class a extends RecyclerView.G {

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private Y0 adapterBinding;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ l f51451C;

        /* compiled from: RecipeBrowseAdapter.kt */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: v5.l$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0738a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f51452a;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f51453b;

            static {
                int[] iArr = new int[r.values().length];
                try {
                    iArr[r.f46513D.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[r.f46514E.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[r.f46515F.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[r.f46516G.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[r.f46517H.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[r.f46520K.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[r.f46518I.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[r.f46519J.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[r.f46521L.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                f51452a = iArr;
                int[] iArr2 = new int[EnumC4130e.values().length];
                try {
                    iArr2[EnumC4130e.f46434E.ordinal()] = 1;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr2[EnumC4130e.f46435F.ordinal()] = 2;
                } catch (NoSuchFieldError unused11) {
                }
                f51453b = iArr2;
            }
        }

        /* compiled from: RecipeBrowseAdapter.kt */
        @Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J9\u0010\u000b\u001a\u00020\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ?\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"v5/l$a$b", "LD6/f;", "Landroid/graphics/drawable/Drawable;", "Lcom/bumptech/glide/load/engine/GlideException;", "e", "", "model", "LE6/i;", "target", "", "isFirstResource", "b", "(Lcom/bumptech/glide/load/engine/GlideException;Ljava/lang/Object;LE6/i;Z)Z", "resource", "Lm6/a;", "dataSource", "c", "(Landroid/graphics/drawable/Drawable;Ljava/lang/Object;LE6/i;Lm6/a;Z)Z", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class b implements D6.f<Drawable> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ l f51454a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ a f51455b;

            b(l lVar, a aVar) {
                this.f51454a = lVar;
                this.f51455b = aVar;
            }

            @Override // D6.f
            public boolean b(GlideException e10, Object model, E6.i<Drawable> target, boolean isFirstResource) {
                C3862t.g(target, "target");
                this.f51454a.imageLoadCompletionMap.put(Integer.valueOf(this.f51455b.getBindingAdapterPosition()), Boolean.TRUE);
                return false;
            }

            @Override // D6.f
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public boolean a(Drawable resource, Object model, E6.i<Drawable> target, EnumC3966a dataSource, boolean isFirstResource) {
                C3862t.g(resource, "resource");
                C3862t.g(model, "model");
                C3862t.g(dataSource, "dataSource");
                this.f51454a.imageLoadCompletionMap.put(Integer.valueOf(this.f51455b.getBindingAdapterPosition()), Boolean.TRUE);
                return false;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l lVar, View itemView, Y0 adapterBinding) {
            super(itemView);
            C3862t.g(itemView, "itemView");
            C3862t.g(adapterBinding, "adapterBinding");
            this.f51451C = lVar;
            this.adapterBinding = adapterBinding;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(l lVar, Recipe recipe, View view) {
            b bVar = lVar.clickListener;
            if (bVar != null) {
                bVar.a(recipe.getId());
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x011e  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0138  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0164  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x01e1  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void d(o4.Recipe r9) {
            /*
                Method dump skipped, instructions count: 680
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: v5.l.a.d(o4.o):void");
        }

        public final void b(final Recipe data) {
            C3862t.g(data, "data");
            d(data);
            ConstraintLayout constraintLayout = this.adapterBinding.f9778t;
            final l lVar = this.f51451C;
            constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: v5.k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    l.a.c(lVar, data, view);
                }
            });
        }
    }

    /* compiled from: RecipeBrowseAdapter.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lv5/l$b;", "", "", "recipeId", "Loa/F;", "a", "(I)V", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface b {
        void a(int recipeId);
    }

    /* compiled from: RecipeBrowseAdapter.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0015¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"v5/l$c", "Landroid/widget/Filter;", "", "constraint", "Landroid/widget/Filter$FilterResults;", "performFiltering", "(Ljava/lang/CharSequence;)Landroid/widget/Filter$FilterResults;", "results", "Loa/F;", "publishResults", "(Ljava/lang/CharSequence;Landroid/widget/Filter$FilterResults;)V", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c extends Filter {
        c() {
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
        @Override // android.widget.Filter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        protected android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r19) {
            /*
                Method dump skipped, instructions count: 552
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: v5.l.c.performFiltering(java.lang.CharSequence):android.widget.Filter$FilterResults");
        }

        @Override // android.widget.Filter
        @SuppressLint({"NotifyDataSetChanged"})
        protected void publishResults(CharSequence constraint, Filter.FilterResults results) {
            ArrayList arrayList;
            l lVar = l.this;
            if ((results != null ? results.values : null) == null) {
                arrayList = new ArrayList();
            } else {
                Object obj = results.values;
                C3862t.e(obj, "null cannot be cast to non-null type java.util.ArrayList<com.apptionlabs.domain.models.recipe.Recipe>");
                arrayList = (ArrayList) obj;
            }
            lVar.recipeListFiltered = arrayList;
            U4.b.t("Search String : " + ((Object) constraint), new Object[0]);
            U4.b.t("Filter applied and total recipes found : " + l.this.recipeListFiltered.size(), new Object[0]);
            w5.f fVar = l.this.searchFilterCallback;
            if (fVar != null) {
                fVar.a(l.this.recipeListFiltered.size());
            }
            l.this.n();
        }
    }

    /* compiled from: RecipeBrowseAdapter.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"v5/l$d", "LU1/B$d;", "Landroidx/media3/common/PlaybackException;", "error", "Loa/F;", "j0", "(Landroidx/media3/common/PlaybackException;)V", "", "playbackState", "N", "(I)V", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d implements B.d {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ ImageView f51457B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ PlayerView f51458C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ l f51459D;

        d(ImageView imageView, PlayerView playerView, l lVar) {
            this.f51457B = imageView;
            this.f51458C = playerView;
            this.f51459D = lVar;
        }

        @Override // U1.B.d
        public void N(int playbackState) {
            if (playbackState != 1) {
                if (playbackState == 2) {
                    Q4.l.j(this.f51457B);
                    Q4.l.i(this.f51458C);
                } else if (playbackState == 3) {
                    this.f51459D.e0(this.f51458C, this.f51457B);
                } else if (playbackState != 4) {
                    Q4.l.j(this.f51457B);
                }
            }
        }

        @Override // U1.B.d
        public void j0(PlaybackException error) {
            C3862t.g(error, "error");
            super.j0(error);
            U4.b.t("Player has issue playing", new Object[0]);
        }
    }

    /* compiled from: RecipeBrowseAdapter.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.recipe.adapter.RecipeBrowseAdapter$startJobToPlayVideo$1", f = "RecipeBrowseAdapter.kt", l = {400, 401, 405, 406}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {2, 0, 0})
    static final class e extends kotlin.coroutines.jvm.internal.l implements Ba.p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f51460B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ PlayerView f51461C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ ImageView f51462D;

        /* compiled from: RecipeBrowseAdapter.kt */
        @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.recipe.adapter.RecipeBrowseAdapter$startJobToPlayVideo$1$1", f = "RecipeBrowseAdapter.kt", l = {}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {2, 0, 0})
        static final class a extends kotlin.coroutines.jvm.internal.l implements Ba.p<I, InterfaceC4588d<? super C4153F>, Object> {

            /* renamed from: B, reason: collision with root package name */
            int f51463B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ PlayerView f51464C;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(PlayerView playerView, InterfaceC4588d<? super a> interfaceC4588d) {
                super(2, interfaceC4588d);
                this.f51464C = playerView;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                return new a(this.f51464C, interfaceC4588d);
            }

            @Override // Ba.p
            public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                return ((a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                C4696b.e();
                if (this.f51463B != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C4173r.b(obj);
                Q4.l.j(this.f51464C);
                return C4153F.f46609a;
            }
        }

        /* compiled from: RecipeBrowseAdapter.kt */
        @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.recipe.adapter.RecipeBrowseAdapter$startJobToPlayVideo$1$2", f = "RecipeBrowseAdapter.kt", l = {}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {2, 0, 0})
        static final class b extends kotlin.coroutines.jvm.internal.l implements Ba.p<I, InterfaceC4588d<? super C4153F>, Object> {

            /* renamed from: B, reason: collision with root package name */
            int f51465B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ ImageView f51466C;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(ImageView imageView, InterfaceC4588d<? super b> interfaceC4588d) {
                super(2, interfaceC4588d);
                this.f51466C = imageView;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                return new b(this.f51466C, interfaceC4588d);
            }

            @Override // Ba.p
            public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                return ((b) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                C4696b.e();
                if (this.f51465B != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C4173r.b(obj);
                Q4.l.i(this.f51466C);
                return C4153F.f46609a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(PlayerView playerView, ImageView imageView, InterfaceC4588d<? super e> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f51461C = playerView;
            this.f51462D = imageView;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return new e(this.f51461C, this.f51462D, interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((e) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0059 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x006d A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = ua.C4696b.e()
                int r1 = r8.f51460B
                r2 = 0
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L2d
                if (r1 == r6) goto L29
                if (r1 == r5) goto L25
                if (r1 == r4) goto L21
                if (r1 != r3) goto L19
                oa.C4173r.b(r9)
                goto L6e
            L19:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L21:
                oa.C4173r.b(r9)
                goto L5a
            L25:
                oa.C4173r.b(r9)
                goto L4f
            L29:
                oa.C4173r.b(r9)
                goto L3b
            L2d:
                oa.C4173r.b(r9)
                r8.f51460B = r6
                r6 = 200(0xc8, double:9.9E-322)
                java.lang.Object r9 = Xb.T.a(r6, r8)
                if (r9 != r0) goto L3b
                return r0
            L3b:
                Xb.G0 r9 = Xb.Z.c()
                v5.l$e$a r1 = new v5.l$e$a
                androidx.media3.ui.PlayerView r6 = r8.f51461C
                r1.<init>(r6, r2)
                r8.f51460B = r5
                java.lang.Object r9 = Xb.C1837g.g(r9, r1, r8)
                if (r9 != r0) goto L4f
                return r0
            L4f:
                r8.f51460B = r4
                r4 = 100
                java.lang.Object r9 = Xb.T.a(r4, r8)
                if (r9 != r0) goto L5a
                return r0
            L5a:
                Xb.G0 r9 = Xb.Z.c()
                v5.l$e$b r1 = new v5.l$e$b
                android.widget.ImageView r4 = r8.f51462D
                r1.<init>(r4, r2)
                r8.f51460B = r3
                java.lang.Object r9 = Xb.C1837g.g(r9, r1, r8)
                if (r9 != r0) goto L6e
                return r0
            L6e:
                oa.F r9 = oa.C4153F.f46609a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: v5.l.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public l() {
        F(true);
    }

    private final H R(Context context, boolean preferExtensionRenderer) {
        C3032d c3032dL = new C3032d(context.getApplicationContext()).m(preferExtensionRenderer ? 2 : 1).l(true);
        C3862t.f(c3032dL, "setEnableDecoderFallback(...)");
        return c3032dL;
    }

    private final void V() {
        ImageView imageViewD;
        PlayerView playerViewD;
        C4170o<Integer, ? extends PlayerView> c4170o = this.currentPlayingVideo;
        if (c4170o != null) {
            if (c4170o != null && (playerViewD = c4170o.d()) != null) {
                B player = playerViewD.getPlayer();
                if (player != null) {
                    player.F(false);
                }
                B player2 = playerViewD.getPlayer();
                if (player2 != null) {
                    player2.c();
                }
            }
            this.currentPlayingVideo = null;
        }
        C4170o<Integer, ? extends ImageView> c4170o2 = this.currentPlayerThumbnail;
        if (c4170o2 != null) {
            if (c4170o2 != null && (imageViewD = c4170o2.d()) != null) {
                Q4.l.j(imageViewD);
            }
            this.currentPlayerThumbnail = null;
        }
    }

    private final void b0(int index, ProgressBar progressbar, ImageView thumbnail, PlayerView playerView, String videoUrl, a.c cacheDir) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        C4170o<Integer, ? extends PlayerView> c4170o = this.currentPlayingVideo;
        if (c4170o == null || c4170o.c().intValue() != index) {
            Q4.l.j(thumbnail);
            ExoPlayer.b bVar = new ExoPlayer.b(x4.g.h());
            Context contextH = x4.g.h();
            C3862t.f(contextH, "getAppContext(...)");
            d0(bVar, contextH, true);
            ExoPlayer exoPlayerF = bVar.f();
            C3862t.f(exoPlayerF, "build(...)");
            exoPlayerF.F(true);
            exoPlayerF.S(2);
            playerView.setKeepContentOnPlayerReset(true);
            playerView.setUseController(false);
            v vVarB = v.b(Uri.parse(videoUrl));
            C3862t.f(vVarB, "fromUri(...)");
            C c10 = new C.b(cacheDir).c(vVarB);
            C3862t.f(c10, "createMediaSource(...)");
            exoPlayerF.a(c10, false);
            exoPlayerF.i();
            playerView.setPlayer(exoPlayerF);
            B player = playerView.getPlayer();
            C3862t.d(player);
            player.C(new d(thumbnail, playerView, this));
        }
    }

    private final void d0(ExoPlayer.b playerBuilder, Context context, boolean preferExtensionDecoders) {
        playerBuilder.l(R(context, preferExtensionDecoders));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e0(PlayerView playerView, ImageView thumbnail) {
        InterfaceC1867v0 interfaceC1867v0 = this.playerJob;
        if (interfaceC1867v0 != null) {
            if (interfaceC1867v0 != null) {
                InterfaceC1867v0.a.a(interfaceC1867v0, null, 1, null);
            }
            this.playerJob = null;
        }
        this.playerJob = C1841i.d(C1854o0.f19099B, Z.b(), null, new e(playerView, thumbnail, null), 2, null);
    }

    public final void Q(String tag, CharSequence query) {
        C3862t.g(tag, "tag");
        String lowerCase = tag.toLowerCase(Locale.ROOT);
        C3862t.f(lowerCase, "toLowerCase(...)");
        this.selectedTag = lowerCase;
        if (query != null) {
            getFilter().filter(query);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public void w(a viewHolder, int position) {
        C3862t.g(viewHolder, "viewHolder");
        Recipe recipe = this.recipeListFiltered.get(position);
        C3862t.f(recipe, "get(...)");
        viewHolder.b(recipe);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public a y(ViewGroup parent, int viewType) {
        C3862t.g(parent, "parent");
        Y0 y0C = Y0.c(LayoutInflater.from(parent.getContext()), parent, false);
        C3862t.f(y0C, "inflate(...)");
        CardView cardViewB = y0C.b();
        C3862t.f(cardViewB, "getRoot(...)");
        return new a(this, cardViewB, y0C);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public void D(a holder) {
        C3862t.g(holder, "holder");
        Y(holder.getBindingAdapterPosition());
        super.D(holder);
    }

    public final void W(int index, a viewHolder, a.c cacheDir) {
        C4170o<Integer, ? extends PlayerView> c4170o;
        C3862t.g(viewHolder, "viewHolder");
        C3862t.g(cacheDir, "cacheDir");
        U4.b.t("playIndexThenPausePreviousPlayer", new Object[0]);
        if (!C3862t.b(this.imageLoadCompletionMap.get(Integer.valueOf(index)), Boolean.TRUE) || ((c4170o = this.currentPlayingVideo) != null && c4170o.c().intValue() == index)) {
            C4170o<Integer, ? extends PlayerView> c4170o2 = this.currentPlayingVideo;
            if (c4170o2 == null || c4170o2.c().intValue() != index) {
                ImageView imageView = (ImageView) viewHolder.itemView.findViewById(R.id.thumbnail);
                C3862t.d(imageView);
                Q4.l.j(imageView);
                return;
            }
            return;
        }
        V();
        ImageView imageView2 = (ImageView) viewHolder.itemView.findViewById(R.id.thumbnail);
        ProgressBar progressBar = (ProgressBar) viewHolder.itemView.findViewById(R.id.progressBar);
        PlayerView playerView = (PlayerView) viewHolder.itemView.findViewById(R.id.playerView);
        if (playerView.getTag() != null) {
            C3862t.d(imageView2);
            C3862t.d(progressBar);
            C3862t.d(playerView);
            b0(index, progressBar, imageView2, playerView, playerView.getTag().toString(), cacheDir);
        }
        this.currentPlayingVideo = new C4170o<>(Integer.valueOf(index), playerView);
        this.currentPlayerThumbnail = new C4170o<>(Integer.valueOf(index), imageView2);
    }

    public final void X() {
        PlayerView playerViewD;
        C4170o<Integer, ? extends PlayerView> c4170o = this.currentPlayingVideo;
        if (c4170o != null) {
            if (c4170o != null && (playerViewD = c4170o.d()) != null) {
                B player = playerViewD.getPlayer();
                if (player != null) {
                    player.F(false);
                }
                B player2 = playerViewD.getPlayer();
                if (player2 != null) {
                    player2.c();
                }
            }
            this.currentPlayingVideo = null;
        }
    }

    public final void Z(b clickListener) {
        this.clickListener = clickListener;
    }

    public final void a0(w5.f listener) {
        C3862t.g(listener, "listener");
        this.searchFilterCallback = listener;
    }

    public final void c0(ArrayList<Recipe> newList) {
        C3862t.g(newList, "newList");
        h.e eVarB = androidx.recyclerview.widget.h.b(new m(this.recipeListFiltered, newList));
        C3862t.f(eVarB, "calculateDiff(...)");
        this.recipeListFiltered.clear();
        this.recipeListFiltered.addAll(newList);
        this.recipeList = this.recipeListFiltered;
        eVarB.c(this);
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        return new c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int h() {
        return this.recipeListFiltered.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long i(int position) {
        return this.recipeListFiltered.get(position).getId();
    }

    public final void Y(int index) {
    }
}
