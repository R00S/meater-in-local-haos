package cm.aptoide.p092pt.dataprovider.model.p094v2;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class Comment {
    private Number answerto;
    private Number appid;
    private String appname;

    /* renamed from: id */
    private Number f8520id;
    private boolean isShowingSubcomments;
    private String lang;
    private String reponame;
    private ArrayList<Comment> subComments = new ArrayList<>();
    private String subject;
    private String text;
    private String timestamp;
    private String useravatar;
    private String useridhash;
    private String username;
    private Number votes;

    public void addSubComment(Comment comment) {
        this.subComments.add(comment);
    }

    public void clearSubcomments() {
        this.subComments.clear();
    }

    public Number getAnswerto() {
        return this.answerto;
    }

    public Number getAppid() {
        return this.appid;
    }

    public String getAppname() {
        return this.appname;
    }

    public Number getId() {
        return this.f8520id;
    }

    public String getLang() {
        return this.lang;
    }

    public String getReponame() {
        return this.reponame;
    }

    public ArrayList<Comment> getSubComments() {
        return this.subComments;
    }

    public String getSubject() {
        return this.subject;
    }

    public String getText() {
        return this.text;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public String getUseravatar() {
        return this.useravatar;
    }

    public String getUseridhash() {
        return this.useridhash;
    }

    public String getUsername() {
        return this.username;
    }

    public Number getVotes() {
        return this.votes;
    }

    public boolean hasSubComments() {
        return this.subComments.size() != 0;
    }

    public boolean isShowingSubcomments() {
        return this.isShowingSubcomments;
    }

    public void setAnswerto(Number number) {
        this.answerto = number;
    }

    public void setAppid(Number number) {
        this.appid = number;
    }

    public void setAppname(String str) {
        this.appname = str;
    }

    public void setId(Number number) {
        this.f8520id = number;
    }

    public void setLang(String str) {
        this.lang = str;
    }

    public void setReponame(String str) {
        this.reponame = str;
    }

    public void setShowingSubcomments(boolean z) {
        this.isShowingSubcomments = z;
    }

    public void setSubject(String str) {
        this.subject = str;
    }

    public void setText(String str) {
        this.text = str;
    }

    public void setTimestamp(String str) {
        this.timestamp = str;
    }

    public void setUseravatar(String str) {
        this.useravatar = str;
    }

    public void setUseridhash(String str) {
        this.useridhash = str;
    }

    public void setUsername(String str) {
        this.username = str;
    }
}
