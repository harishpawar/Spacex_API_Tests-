package entities;


public class Reddit {
    public String campaign;
    public String launch;

    public String getCampaign() {
        return campaign;
    }

    public void setCampaign(String campaign) {
        this.campaign = campaign;
    }

    public String getLaunch() {
        return launch;
    }

    public void setLaunch(String launch) {
        this.launch = launch;
    }

    public Object getMedia() {
        return media;
    }

    public void setMedia(Object media) {
        this.media = media;
    }

    public String getRecovery() {
        return recovery;
    }

    public void setRecovery(String recovery) {
        this.recovery = recovery;
    }

    public Object media;
    public String recovery;
}
