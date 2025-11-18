package cm.aptoide.p092pt.dataprovider.model.p096v7;

import cm.aptoide.p092pt.dataprovider.model.p096v7.listapp.App;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.home.Appearance;
import java.util.List;

/* loaded from: classes.dex */
public class EditorialCard extends BaseV7Response {
    private Data data;

    public static class Action {
        private String title;
        private String url;

        public String getTitle() {
            return this.title;
        }

        public String getUrl() {
            return this.url;
        }

        public void setTitle(String str) {
            this.title = str;
        }

        public void setUrl(String str) {
            this.url = str;
        }
    }

    public static class Content {
        private Action action;
        private App app;
        private List<Media> media;
        private String message;
        private String title;
        private String type;

        public Action getAction() {
            return this.action;
        }

        public App getApp() {
            return this.app;
        }

        public List<Media> getMedia() {
            return this.media;
        }

        public String getMessage() {
            return this.message;
        }

        public String getTitle() {
            return this.title;
        }

        public String getType() {
            return this.type;
        }

        public void setAction(Action action) {
            this.action = action;
        }

        public void setApp(App app) {
            this.app = app;
        }

        public void setMedia(List<Media> list) {
            this.media = list;
        }

        public void setMessage(String str) {
            this.message = str;
        }

        public void setTitle(String str) {
            this.title = str;
        }

        public void setType(String str) {
            this.type = str;
        }
    }

    public static class Data {
        private Appearance appearance;
        private String background;
        private String caption;
        private List<Content> content;

        /* renamed from: id */
        private String f8530id;
        private String title;
        private String type;

        public Appearance getAppearance() {
            return this.appearance;
        }

        public String getBackground() {
            return this.background;
        }

        public String getCaption() {
            return this.caption;
        }

        public List<Content> getContent() {
            return this.content;
        }

        public String getId() {
            return this.f8530id;
        }

        public String getTitle() {
            return this.title;
        }

        public String getType() {
            return this.type;
        }

        public void setAppearance(Appearance appearance) {
            this.appearance = appearance;
        }

        public void setBackground(String str) {
            this.background = str;
        }

        public void setCaption(String str) {
            this.caption = str;
        }

        public void setContent(List<Content> list) {
            this.content = list;
        }

        public void setId(String str) {
            this.f8530id = str;
        }

        public void setTitle(String str) {
            this.title = str;
        }

        public void setType(String str) {
            this.type = str;
        }
    }

    public static class Media {
        private String description;
        private String image;
        private String thumbnail;
        private String type;
        private String url;

        public String getDescription() {
            return this.description;
        }

        public String getImage() {
            return this.image;
        }

        public String getThumbnail() {
            return this.thumbnail;
        }

        public String getType() {
            return this.type;
        }

        public String getUrl() {
            return this.url;
        }

        public void setDescription(String str) {
            this.description = str;
        }

        public void setImage(String str) {
            this.image = str;
        }

        public void setThumbnail(String str) {
            this.thumbnail = str;
        }

        public void setType(String str) {
            this.type = str;
        }

        public void setUrl(String str) {
            this.url = str;
        }
    }

    public Data getData() {
        return this.data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}
