package cm.aptoide.p092pt.dataprovider.p097ws.p101v7.store;

import java.io.File;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/* loaded from: classes.dex */
public class RequestBodyFactory {
    public MultipartBody.Part createBodyPartFromFile(String str, File file) {
        return MultipartBody.Part.createFormData(str, file.getName(), RequestBody.create(MediaType.parse("multipart/form-data"), file));
    }

    public RequestBody createBodyPartFromLong(long j2) {
        return RequestBody.create(MediaType.parse("multipart/form-data"), String.valueOf(j2));
    }

    public RequestBody createBodyPartFromString(String str) {
        if (str == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return RequestBody.create(MediaType.parse("multipart/form-data"), str);
    }
}
