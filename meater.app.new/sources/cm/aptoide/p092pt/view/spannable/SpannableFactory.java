package cm.aptoide.p092pt.view.spannable;

import android.content.Context;
import android.text.ParcelableSpan;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TextAppearanceSpan;

/* loaded from: classes.dex */
public class SpannableFactory {
    private Spannable createSpan(String str, ParcelableSpan parcelableSpan, String[] strArr) {
        SpannableString spannableString = new SpannableString(str);
        for (String str2 : strArr) {
            int iIndexOf = str.indexOf(str2);
            if (iIndexOf >= 0 && iIndexOf < str.length() && str2.length() <= str.length()) {
                spannableString.setSpan(parcelableSpan, iIndexOf, str2.length() + iIndexOf, 33);
            }
        }
        return spannableString;
    }

    public Spannable createColorSpan(String str, int i2, String... strArr) {
        return createSpan(str, new ForegroundColorSpan(i2), strArr);
    }

    public Spannable createMultiSpan(String str, ParcelableSpan[] parcelableSpanArr, String... strArr) {
        SpannableString spannableString = new SpannableString(str);
        for (ParcelableSpan parcelableSpan : parcelableSpanArr) {
            for (String str2 : strArr) {
                int iIndexOf = str.indexOf(str2);
                if (iIndexOf >= 0 && iIndexOf < str.length() && str2.length() <= str.length()) {
                    spannableString.setSpan(parcelableSpan, iIndexOf, str2.length() + iIndexOf, 33);
                }
            }
        }
        return spannableString;
    }

    public Spannable createStyleSpan(String str, int i2, String... strArr) {
        return createSpan(str, new StyleSpan(i2), strArr);
    }

    public Spannable createTextAppearanceSpan(Context context, int i2, String str, String... strArr) {
        return createSpan(str, new TextAppearanceSpan(context, i2), strArr);
    }

    public Spannable createSpan(String str, ParcelableSpan[] parcelableSpanArr, String... strArr) {
        SpannableString spannableString = new SpannableString(str);
        if (parcelableSpanArr != null && strArr != null && parcelableSpanArr.length <= strArr.length) {
            for (int i2 = 0; i2 < parcelableSpanArr.length; i2++) {
                String str2 = strArr[i2];
                int iIndexOf = str.indexOf(str2);
                if (iIndexOf >= 0 && iIndexOf < str.length() && str2.length() <= str.length()) {
                    spannableString.setSpan(parcelableSpanArr[i2], iIndexOf, str2.length() + iIndexOf, 33);
                }
            }
        }
        return spannableString;
    }
}
