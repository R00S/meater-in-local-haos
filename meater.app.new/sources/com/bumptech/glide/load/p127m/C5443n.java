package com.bumptech.glide.load.p127m;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: StreamLocalUriFetcher.java */
/* renamed from: com.bumptech.glide.load.m.n */
/* loaded from: classes.dex */
public class C5443n extends AbstractC5441l<InputStream> {

    /* renamed from: i */
    private static final UriMatcher f13590i;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f13590i = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        uriMatcher.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    public C5443n(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    /* renamed from: i */
    private InputStream m10487i(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        int iMatch = f13590i.match(uri);
        if (iMatch != 1) {
            if (iMatch == 3) {
                return m10488j(contentResolver, uri);
            }
            if (iMatch != 5) {
                return contentResolver.openInputStream(uri);
            }
        }
        Uri uriLookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uri);
        if (uriLookupContact != null) {
            return m10488j(contentResolver, uriLookupContact);
        }
        throw new FileNotFoundException("Contact cannot be found");
    }

    /* renamed from: j */
    private InputStream m10488j(ContentResolver contentResolver, Uri uri) {
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }

    @Override // com.bumptech.glide.load.p127m.InterfaceC5433d
    /* renamed from: a */
    public Class<InputStream> mo10455a() {
        return InputStream.class;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.load.p127m.AbstractC5441l
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void mo10456c(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.load.p127m.AbstractC5441l
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public InputStream mo10457f(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        InputStream inputStreamM10487i = m10487i(uri, contentResolver);
        if (inputStreamM10487i != null) {
            return inputStreamM10487i;
        }
        throw new FileNotFoundException("InputStream is null for " + uri);
    }
}
