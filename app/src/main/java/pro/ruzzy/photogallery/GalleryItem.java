package pro.ruzzy.photogallery;

public class GalleryItem {
    private String mCaption;
    private String mId;
    private String mUrl;

    public String getCaption() {
        return mCaption;
    }

    public void setCaption(String Caption) {
        this.mCaption = Caption;
    }

    public String getId() {
        return mId;
    }

    public void setId(String Id) {
        this.mId = Id;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String Url) {
        this.mUrl = Url;
    }

    @Override
    public String toString() {
        return mCaption;
    }
}
