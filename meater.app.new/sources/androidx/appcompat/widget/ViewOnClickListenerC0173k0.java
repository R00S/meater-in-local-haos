package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
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
import androidx.core.content.C0255a;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;
import okhttp3.HttpUrl;
import p024c.p025a.C0823a;
import p024c.p025a.C0828f;
import p024c.p060j.p061a.AbstractC0963c;

/* compiled from: SuggestionsAdapter.java */
@SuppressLint({"RestrictedAPI"})
/* renamed from: androidx.appcompat.widget.k0 */
/* loaded from: classes.dex */
class ViewOnClickListenerC0173k0 extends AbstractC0963c implements View.OnClickListener {

    /* renamed from: i */
    private final SearchView f1182i;

    /* renamed from: j */
    private final SearchableInfo f1183j;

    /* renamed from: k */
    private final Context f1184k;

    /* renamed from: l */
    private final WeakHashMap<String, Drawable.ConstantState> f1185l;

    /* renamed from: m */
    private final int f1186m;

    /* renamed from: n */
    private boolean f1187n;

    /* renamed from: o */
    private int f1188o;

    /* renamed from: p */
    private ColorStateList f1189p;

    /* renamed from: q */
    private int f1190q;

    /* renamed from: r */
    private int f1191r;

    /* renamed from: s */
    private int f1192s;

    /* renamed from: t */
    private int f1193t;

    /* renamed from: u */
    private int f1194u;

    /* renamed from: v */
    private int f1195v;

    /* compiled from: SuggestionsAdapter.java */
    /* renamed from: androidx.appcompat.widget.k0$a */
    private static final class a {

        /* renamed from: a */
        public final TextView f1196a;

        /* renamed from: b */
        public final TextView f1197b;

        /* renamed from: c */
        public final ImageView f1198c;

        /* renamed from: d */
        public final ImageView f1199d;

        /* renamed from: e */
        public final ImageView f1200e;

        public a(View view) {
            this.f1196a = (TextView) view.findViewById(R.id.text1);
            this.f1197b = (TextView) view.findViewById(R.id.text2);
            this.f1198c = (ImageView) view.findViewById(R.id.icon1);
            this.f1199d = (ImageView) view.findViewById(R.id.icon2);
            this.f1200e = (ImageView) view.findViewById(C0828f.f5152q);
        }
    }

    public ViewOnClickListenerC0173k0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.f1187n = false;
        this.f1188o = 1;
        this.f1190q = -1;
        this.f1191r = -1;
        this.f1192s = -1;
        this.f1193t = -1;
        this.f1194u = -1;
        this.f1195v = -1;
        this.f1182i = searchView;
        this.f1183j = searchableInfo;
        this.f1186m = searchView.getSuggestionCommitIconResId();
        this.f1184k = context;
        this.f1185l = weakHashMap;
    }

    /* renamed from: a */
    private Drawable m1040a(String str) {
        Drawable.ConstantState constantState = this.f1185l.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    /* renamed from: b */
    private CharSequence m1041b(CharSequence charSequence) {
        if (this.f1189p == null) {
            TypedValue typedValue = new TypedValue();
            this.mContext.getTheme().resolveAttribute(C0823a.f5024M, typedValue, true);
            this.f1189p = this.mContext.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f1189p, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    /* renamed from: c */
    private Drawable m1042c(ComponentName componentName) throws PackageManager.NameNotFoundException {
        PackageManager packageManager = this.mContext.getPackageManager();
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
        } catch (PackageManager.NameNotFoundException e2) {
            Log.w("SuggestionsAdapter", e2.toString());
            return null;
        }
    }

    /* renamed from: d */
    private Drawable m1043d(ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strFlattenToShortString = componentName.flattenToShortString();
        if (!this.f1185l.containsKey(strFlattenToShortString)) {
            Drawable drawableM1042c = m1042c(componentName);
            this.f1185l.put(strFlattenToShortString, drawableM1042c != null ? drawableM1042c.getConstantState() : null);
            return drawableM1042c;
        }
        Drawable.ConstantState constantState = this.f1185l.get(strFlattenToShortString);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable(this.f1184k.getResources());
    }

    /* renamed from: e */
    public static String m1044e(Cursor cursor, String str) {
        return m1050m(cursor, cursor.getColumnIndex(str));
    }

    /* renamed from: f */
    private Drawable m1045f() throws PackageManager.NameNotFoundException {
        Drawable drawableM1043d = m1043d(this.f1183j.getSearchActivity());
        return drawableM1043d != null ? drawableM1043d : this.mContext.getPackageManager().getDefaultActivityIcon();
    }

    /* renamed from: g */
    private Drawable m1046g(Uri uri) throws IOException {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return m1055h(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream inputStreamOpenInputStream = this.f1184k.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                throw new FileNotFoundException("Failed to open " + uri);
            }
            try {
                return Drawable.createFromStream(inputStreamOpenInputStream, null);
            } finally {
                try {
                    inputStreamOpenInputStream.close();
                } catch (IOException e2) {
                    Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e2);
                }
            }
        } catch (FileNotFoundException e3) {
            Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e3.getMessage());
            return null;
        }
        Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e3.getMessage());
        return null;
    }

    /* renamed from: i */
    private Drawable m1047i(String str) throws NumberFormatException, IOException {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int i2 = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f1184k.getPackageName() + "/" + i2;
            Drawable drawableM1040a = m1040a(str2);
            if (drawableM1040a != null) {
                return drawableM1040a;
            }
            Drawable drawableM1677f = C0255a.m1677f(this.f1184k, i2);
            m1053q(str2, drawableM1677f);
            return drawableM1677f;
        } catch (Resources.NotFoundException unused) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        } catch (NumberFormatException unused2) {
            Drawable drawableM1040a2 = m1040a(str);
            if (drawableM1040a2 != null) {
                return drawableM1040a2;
            }
            Drawable drawableM1046g = m1046g(Uri.parse(str));
            m1053q(str, drawableM1046g);
            return drawableM1046g;
        }
    }

    /* renamed from: j */
    private Drawable m1048j(Cursor cursor) throws NumberFormatException, IOException {
        int i2 = this.f1193t;
        if (i2 == -1) {
            return null;
        }
        Drawable drawableM1047i = m1047i(cursor.getString(i2));
        return drawableM1047i != null ? drawableM1047i : m1045f();
    }

    /* renamed from: k */
    private Drawable m1049k(Cursor cursor) {
        int i2 = this.f1194u;
        if (i2 == -1) {
            return null;
        }
        return m1047i(cursor.getString(i2));
    }

    /* renamed from: m */
    private static String m1050m(Cursor cursor, int i2) {
        if (i2 == -1) {
            return null;
        }
        try {
            return cursor.getString(i2);
        } catch (Exception e2) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e2);
            return null;
        }
    }

    /* renamed from: o */
    private void m1051o(ImageView imageView, Drawable drawable, int i2) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i2);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    /* renamed from: p */
    private void m1052p(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    /* renamed from: q */
    private void m1053q(String str, Drawable drawable) {
        if (drawable != null) {
            this.f1185l.put(str, drawable.getConstantState());
        }
    }

    /* renamed from: r */
    private void m1054r(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras == null || extras.getBoolean("in_progress")) {
        }
    }

    @Override // p024c.p060j.p061a.AbstractC0961a
    public void bindView(View view, Context context, Cursor cursor) {
        a aVar = (a) view.getTag();
        int i2 = this.f1195v;
        int i3 = i2 != -1 ? cursor.getInt(i2) : 0;
        if (aVar.f1196a != null) {
            m1052p(aVar.f1196a, m1050m(cursor, this.f1190q));
        }
        if (aVar.f1197b != null) {
            String strM1050m = m1050m(cursor, this.f1192s);
            CharSequence charSequenceM1041b = strM1050m != null ? m1041b(strM1050m) : m1050m(cursor, this.f1191r);
            if (TextUtils.isEmpty(charSequenceM1041b)) {
                TextView textView = aVar.f1196a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f1196a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f1196a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f1196a.setMaxLines(1);
                }
            }
            m1052p(aVar.f1197b, charSequenceM1041b);
        }
        ImageView imageView = aVar.f1198c;
        if (imageView != null) {
            m1051o(imageView, m1048j(cursor), 4);
        }
        ImageView imageView2 = aVar.f1199d;
        if (imageView2 != null) {
            m1051o(imageView2, m1049k(cursor), 8);
        }
        int i4 = this.f1188o;
        if (i4 != 2 && (i4 != 1 || (i3 & 1) == 0)) {
            aVar.f1200e.setVisibility(8);
            return;
        }
        aVar.f1200e.setVisibility(0);
        aVar.f1200e.setTag(aVar.f1196a.getText());
        aVar.f1200e.setOnClickListener(this);
    }

    @Override // p024c.p060j.p061a.AbstractC0961a, p024c.p060j.p061a.C0962b.a
    public void changeCursor(Cursor cursor) {
        if (this.f1187n) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.changeCursor(cursor);
            if (cursor != null) {
                this.f1190q = cursor.getColumnIndex("suggest_text_1");
                this.f1191r = cursor.getColumnIndex("suggest_text_2");
                this.f1192s = cursor.getColumnIndex("suggest_text_2_url");
                this.f1193t = cursor.getColumnIndex("suggest_icon_1");
                this.f1194u = cursor.getColumnIndex("suggest_icon_2");
                this.f1195v = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e2) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e2);
        }
    }

    @Override // p024c.p060j.p061a.AbstractC0961a, p024c.p060j.p061a.C0962b.a
    public CharSequence convertToString(Cursor cursor) {
        String strM1044e;
        String strM1044e2;
        if (cursor == null) {
            return null;
        }
        String strM1044e3 = m1044e(cursor, "suggest_intent_query");
        if (strM1044e3 != null) {
            return strM1044e3;
        }
        if (this.f1183j.shouldRewriteQueryFromData() && (strM1044e2 = m1044e(cursor, "suggest_intent_data")) != null) {
            return strM1044e2;
        }
        if (!this.f1183j.shouldRewriteQueryFromText() || (strM1044e = m1044e(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return strM1044e;
    }

    @Override // p024c.p060j.p061a.AbstractC0961a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i2, view, viewGroup);
        } catch (RuntimeException e2) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e2);
            View viewNewDropDownView = newDropDownView(this.mContext, this.mCursor, viewGroup);
            if (viewNewDropDownView != null) {
                ((a) viewNewDropDownView.getTag()).f1196a.setText(e2.toString());
            }
            return viewNewDropDownView;
        }
    }

    @Override // p024c.p060j.p061a.AbstractC0961a, android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i2, view, viewGroup);
        } catch (RuntimeException e2) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e2);
            View viewNewView = newView(this.mContext, this.mCursor, viewGroup);
            if (viewNewView != null) {
                ((a) viewNewView.getTag()).f1196a.setText(e2.toString());
            }
            return viewNewView;
        }
    }

    /* renamed from: h */
    Drawable m1055h(Uri uri) throws PackageManager.NameNotFoundException, NumberFormatException, FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.mContext.getPackageManager().getResourcesForApplication(authority);
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

    @Override // p024c.p060j.p061a.AbstractC0961a, android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    /* renamed from: l */
    Cursor m1056l(SearchableInfo searchableInfo, String str, int i2) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder builderFragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query(HttpUrl.FRAGMENT_ENCODE_SET).fragment(HttpUrl.FRAGMENT_ENCODE_SET);
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
        if (i2 > 0) {
            builderFragment.appendQueryParameter("limit", String.valueOf(i2));
        }
        return this.mContext.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }

    /* renamed from: n */
    public void m1057n(int i2) {
        this.f1188o = i2;
    }

    @Override // p024c.p060j.p061a.AbstractC0963c, p024c.p060j.p061a.AbstractC0961a
    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        View viewNewView = super.newView(context, cursor, viewGroup);
        viewNewView.setTag(new a(viewNewView));
        ((ImageView) viewNewView.findViewById(C0828f.f5152q)).setImageResource(this.f1186m);
        return viewNewView;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        m1054r(getCursor());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        m1054r(getCursor());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f1182i.m801U((CharSequence) tag);
        }
    }

    @Override // p024c.p060j.p061a.AbstractC0961a, p024c.p060j.p061a.C0962b.a
    public Cursor runQueryOnBackgroundThread(CharSequence charSequence) {
        String string = charSequence == null ? HttpUrl.FRAGMENT_ENCODE_SET : charSequence.toString();
        if (this.f1182i.getVisibility() == 0 && this.f1182i.getWindowVisibility() == 0) {
            try {
                Cursor cursorM1056l = m1056l(this.f1183j, string, 50);
                if (cursorM1056l != null) {
                    cursorM1056l.getCount();
                    return cursorM1056l;
                }
            } catch (RuntimeException e2) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e2);
            }
        }
        return null;
    }
}
