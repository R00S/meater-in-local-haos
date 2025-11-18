package cm.aptoide.p092pt.account.view;

import android.content.Context;
import android.content.res.Resources;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.account.view.exception.InvalidImageException;
import cm.aptoide.p092pt.themes.ThemeManager;
import cm.aptoide.p092pt.utils.GenericDialogs;
import java.util.Iterator;
import p456rx.C11234e;

/* loaded from: classes.dex */
public class ImagePickerErrorHandler {
    private final Context context;
    private final Resources resources;
    private final ThemeManager themeManager;

    /* renamed from: cm.aptoide.pt.account.view.ImagePickerErrorHandler$1 */
    static /* synthetic */ class C12151 {

        /* renamed from: $SwitchMap$cm$aptoide$pt$account$view$exception$InvalidImageException$ImageError */
        static final /* synthetic */ int[] f7289xc452ba21;

        static {
            int[] iArr = new int[InvalidImageException.ImageError.values().length];
            f7289xc452ba21 = iArr;
            try {
                iArr[InvalidImageException.ImageError.MIN_HEIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7289xc452ba21[InvalidImageException.ImageError.MAX_HEIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7289xc452ba21[InvalidImageException.ImageError.MIN_WIDTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7289xc452ba21[InvalidImageException.ImageError.MAX_WIDTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7289xc452ba21[InvalidImageException.ImageError.MAX_IMAGE_SIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7289xc452ba21[InvalidImageException.ImageError.ERROR_DECODING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public ImagePickerErrorHandler(Context context, ThemeManager themeManager) {
        this.context = context;
        this.resources = context.getResources();
        this.themeManager = themeManager;
    }

    private String buildErrorMessage(InvalidImageException invalidImageException) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.resources.getString(C1146R.string.image_requirements_popup_message));
        Iterator<InvalidImageException.ImageError> it = invalidImageException.getImageErrors().iterator();
        while (it.hasNext()) {
            switch (C12151.f7289xc452ba21[it.next().ordinal()]) {
                case 1:
                    sb.append(this.resources.getString(C1146R.string.image_requirements_error_min_height));
                    break;
                case 2:
                    sb.append(this.resources.getString(C1146R.string.image_requirements_error_max_height));
                    break;
                case 3:
                    sb.append(this.resources.getString(C1146R.string.image_requirements_error_min_width));
                    break;
                case 4:
                    sb.append(this.resources.getString(C1146R.string.image_requirements_error_max_width));
                    break;
                case 5:
                    sb.append(this.resources.getString(C1146R.string.image_requirements_error_max_file_size));
                    break;
                case 6:
                    sb.append(this.resources.getString(C1146R.string.image_requirements_error_open_image));
                    break;
            }
        }
        int iLastIndexOf = sb.lastIndexOf("\n");
        if (iLastIndexOf > 0) {
            sb.delete(iLastIndexOf, sb.length());
        }
        return sb.toString();
    }

    public C11234e<GenericDialogs.EResponse> showIconPropertiesError(InvalidImageException invalidImageException) {
        return GenericDialogs.createGenericOkMessage(this.context, this.resources.getString(C1146R.string.image_requirements_error_popup_title), buildErrorMessage(invalidImageException), this.themeManager.getAttributeForTheme(C1146R.attr.dialogsTheme).resourceId);
    }
}
