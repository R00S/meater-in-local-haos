package androidx.appcompat.widget;

import android.R;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import g1.C3377a;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;
import w1.AbstractC4973c;

/* compiled from: SuggestionsAdapter.java */
/* loaded from: classes.dex */
class U extends AbstractC4973c implements View.OnClickListener {

    /* renamed from: M, reason: collision with root package name */
    private final SearchView f21560M;

    /* renamed from: N, reason: collision with root package name */
    private final SearchableInfo f21561N;

    /* renamed from: O, reason: collision with root package name */
    private final Context f21562O;

    /* renamed from: P, reason: collision with root package name */
    private final WeakHashMap<String, Drawable.ConstantState> f21563P;

    /* renamed from: Q, reason: collision with root package name */
    private final int f21564Q;

    /* renamed from: R, reason: collision with root package name */
    private boolean f21565R;

    /* renamed from: S, reason: collision with root package name */
    private int f21566S;

    /* renamed from: T, reason: collision with root package name */
    private ColorStateList f21567T;

    /* renamed from: U, reason: collision with root package name */
    private int f21568U;

    /* renamed from: V, reason: collision with root package name */
    private int f21569V;

    /* renamed from: W, reason: collision with root package name */
    private int f21570W;

    /* renamed from: X, reason: collision with root package name */
    private int f21571X;

    /* renamed from: Y, reason: collision with root package name */
    private int f21572Y;

    /* renamed from: Z, reason: collision with root package name */
    private int f21573Z;

    /* compiled from: SuggestionsAdapter.java */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final TextView f21574a;

        /* renamed from: b, reason: collision with root package name */
        public final TextView f21575b;

        /* renamed from: c, reason: collision with root package name */
        public final ImageView f21576c;

        /* renamed from: d, reason: collision with root package name */
        public final ImageView f21577d;

        /* renamed from: e, reason: collision with root package name */
        public final ImageView f21578e;

        public a(View view) {
            this.f21574a = (TextView) view.findViewById(R.id.text1);
            this.f21575b = (TextView) view.findViewById(R.id.text2);
            this.f21576c = (ImageView) view.findViewById(R.id.icon1);
            this.f21577d = (ImageView) view.findViewById(R.id.icon2);
            this.f21578e = (ImageView) view.findViewById(i.f.f42516q);
        }
    }

    public U(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.f21565R = false;
        this.f21566S = 1;
        this.f21568U = -1;
        this.f21569V = -1;
        this.f21570W = -1;
        this.f21571X = -1;
        this.f21572Y = -1;
        this.f21573Z = -1;
        this.f21560M = searchView;
        this.f21561N = searchableInfo;
        this.f21564Q = searchView.getSuggestionCommitIconResId();
        this.f21562O = context;
        this.f21563P = weakHashMap;
    }

    private void A(String str, Drawable drawable) {
        if (drawable != null) {
            this.f21563P.put(str, drawable.getConstantState());
        }
    }

    private void B(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    private Drawable k(String str) {
        Drawable.ConstantState constantState = this.f21563P.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    private CharSequence l(CharSequence charSequence) {
        if (this.f21567T == null) {
            TypedValue typedValue = new TypedValue();
            this.f21562O.getTheme().resolveAttribute(i.a.f42391N, typedValue, true);
            this.f21567T = this.f21562O.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f21567T, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    private Drawable m(ComponentName componentName) throws PackageManager.NameNotFoundException {
        PackageManager packageManager = this.f21562O.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            Log.w("SuggestionsAdapter", "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString());
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("SuggestionsAdapter", e10.toString());
            return null;
        }
    }

    private Drawable n(ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strFlattenToShortString = componentName.flattenToShortString();
        if (!this.f21563P.containsKey(strFlattenToShortString)) {
            Drawable drawableM = m(componentName);
            this.f21563P.put(strFlattenToShortString, drawableM != null ? drawableM.getConstantState() : null);
            return drawableM;
        }
        Drawable.ConstantState constantState = this.f21563P.get(strFlattenToShortString);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable(this.f21562O.getResources());
    }

    public static String o(Cursor cursor, String str) {
        return w(cursor, cursor.getColumnIndex(str));
    }

    private Drawable p() throws PackageManager.NameNotFoundException {
        Drawable drawableN = n(this.f21561N.getSearchActivity());
        return drawableN != null ? drawableN : this.f21562O.getPackageManager().getDefaultActivityIcon();
    }

    private Drawable q(Uri uri) throws IOException {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return r(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream inputStreamOpenInputStream = this.f21562O.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                throw new FileNotFoundException("Failed to open " + uri);
            }
            try {
                return Drawable.createFromStream(inputStreamOpenInputStream, null);
            } finally {
                try {
                    inputStreamOpenInputStream.close();
                } catch (IOException e10) {
                    Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e10);
                }
            }
        } catch (FileNotFoundException e11) {
            Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e11.getMessage());
            return null;
        }
        Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e11.getMessage());
        return null;
    }

    private Drawable s(String str) throws NumberFormatException, IOException {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int i10 = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f21562O.getPackageName() + "/" + i10;
            Drawable drawableK = k(str2);
            if (drawableK != null) {
                return drawableK;
            }
            Drawable drawableE = C3377a.e(this.f21562O, i10);
            A(str2, drawableE);
            return drawableE;
        } catch (Resources.NotFoundException unused) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        } catch (NumberFormatException unused2) {
            Drawable drawableK2 = k(str);
            if (drawableK2 != null) {
                return drawableK2;
            }
            Drawable drawableQ = q(Uri.parse(str));
            A(str, drawableQ);
            return drawableQ;
        }
    }

    private Drawable t(Cursor cursor) throws NumberFormatException, IOException {
        int i10 = this.f21571X;
        if (i10 == -1) {
            return null;
        }
        Drawable drawableS = s(cursor.getString(i10));
        return drawableS != null ? drawableS : p();
    }

    private Drawable u(Cursor cursor) {
        int i10 = this.f21572Y;
        if (i10 == -1) {
            return null;
        }
        return s(cursor.getString(i10));
    }

    private static String w(Cursor cursor, int i10) {
        if (i10 == -1) {
            return null;
        }
        try {
            return cursor.getString(i10);
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e10);
            return null;
        }
    }

    private void y(ImageView imageView, Drawable drawable, int i10) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i10);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    private void z(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    @Override // w1.AbstractC4971a, w1.C4972b.a
    public void a(Cursor cursor) {
        if (this.f21565R) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.a(cursor);
            if (cursor != null) {
                this.f21568U = cursor.getColumnIndex("suggest_text_1");
                this.f21569V = cursor.getColumnIndex("suggest_text_2");
                this.f21570W = cursor.getColumnIndex("suggest_text_2_url");
                this.f21571X = cursor.getColumnIndex("suggest_icon_1");
                this.f21572Y = cursor.getColumnIndex("suggest_icon_2");
                this.f21573Z = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e10);
        }
    }

    @Override // w1.AbstractC4971a, w1.C4972b.a
    public CharSequence c(Cursor cursor) {
        String strO;
        String strO2;
        if (cursor == null) {
            return null;
        }
        String strO3 = o(cursor, "suggest_intent_query");
        if (strO3 != null) {
            return strO3;
        }
        if (this.f21561N.shouldRewriteQueryFromData() && (strO2 = o(cursor, "suggest_intent_data")) != null) {
            return strO2;
        }
        if (!this.f21561N.shouldRewriteQueryFromText() || (strO = o(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return strO;
    }

    @Override // w1.C4972b.a
    public Cursor d(CharSequence charSequence) {
        String string = charSequence == null ? "" : charSequence.toString();
        if (this.f21560M.getVisibility() == 0 && this.f21560M.getWindowVisibility() == 0) {
            try {
                Cursor cursorV = v(this.f21561N, string, 50);
                if (cursorV != null) {
                    cursorV.getCount();
                    return cursorV;
                }
            } catch (RuntimeException e10) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e10);
            }
        }
        return null;
    }

    @Override // w1.AbstractC4971a
    public void e(View view, Context context, Cursor cursor) {
        a aVar = (a) view.getTag();
        int i10 = this.f21573Z;
        int i11 = i10 != -1 ? cursor.getInt(i10) : 0;
        if (aVar.f21574a != null) {
            z(aVar.f21574a, w(cursor, this.f21568U));
        }
        if (aVar.f21575b != null) {
            String strW = w(cursor, this.f21570W);
            CharSequence charSequenceL = strW != null ? l(strW) : w(cursor, this.f21569V);
            if (TextUtils.isEmpty(charSequenceL)) {
                TextView textView = aVar.f21574a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f21574a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f21574a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f21574a.setMaxLines(1);
                }
            }
            z(aVar.f21575b, charSequenceL);
        }
        ImageView imageView = aVar.f21576c;
        if (imageView != null) {
            y(imageView, t(cursor), 4);
        }
        ImageView imageView2 = aVar.f21577d;
        if (imageView2 != null) {
            y(imageView2, u(cursor), 8);
        }
        int i12 = this.f21566S;
        if (i12 != 2 && (i12 != 1 || (i11 & 1) == 0)) {
            aVar.f21578e.setVisibility(8);
            return;
        }
        aVar.f21578e.setVisibility(0);
        aVar.f21578e.setTag(aVar.f21574a.getText());
        aVar.f21578e.setOnClickListener(this);
    }

    @Override // w1.AbstractC4971a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View viewG = g(this.f21562O, b(), viewGroup);
            if (viewG != null) {
                ((a) viewG.getTag()).f21574a.setText(e10.toString());
            }
            return viewG;
        }
    }

    @Override // w1.AbstractC4971a, android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View viewH = h(this.f21562O, b(), viewGroup);
            if (viewH != null) {
                ((a) viewH.getTag()).f21574a.setText(e10.toString());
            }
            return viewH;
        }
    }

    @Override // w1.AbstractC4973c, w1.AbstractC4971a
    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        View viewH = super.h(context, cursor, viewGroup);
        viewH.setTag(new a(viewH));
        ((ImageView) viewH.findViewById(i.f.f42516q)).setImageResource(this.f21564Q);
        return viewH;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        B(b());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        B(b());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f21560M.U((CharSequence) tag);
        }
    }

    Drawable r(Uri uri) throws PackageManager.NameNotFoundException, NumberFormatException, FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f21562O.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (identifier != 0) {
                return resourcesForApplication.getDrawable(identifier);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    Cursor v(SearchableInfo searchableInfo, String str, int i10) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder builderFragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            builderFragment.appendEncodedPath(suggestPath);
        }
        builderFragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            builderFragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i10 > 0) {
            builderFragment.appendQueryParameter("limit", String.valueOf(i10));
        }
        return this.f21562O.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }

    public void x(int i10) {
        this.f21566S = i10;
    }
}
