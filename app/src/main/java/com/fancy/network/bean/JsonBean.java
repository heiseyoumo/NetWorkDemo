package com.fancy.network.bean;

import java.util.List;

/**
 * @author pengkuanwang
 * @date 2019-06-14
 */
public class JsonBean {
    private String postid;
    private String series;
    private String clientadurl;
    private String desc;
    private String datatime;
    private String createdate;
    private String scover;
    private String autoid;
    private String url;
    private String creator;
    private String reporter;
    private String setname;
    private String neteasecode;
    private String cover;
    private boolean hideAd;
    private String commenturl;
    private String source;
    private String settag;
    private String boardid;
    private String tcover;
    private String imgsum;
    private List<?> relatedids;
    private List<PhotosBean> photos;

    public String getPostid() {
        return postid;
    }

    public void setPostid(String postid) {
        this.postid = postid;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getClientadurl() {
        return clientadurl;
    }

    public void setClientadurl(String clientadurl) {
        this.clientadurl = clientadurl;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDatatime() {
        return datatime;
    }

    public void setDatatime(String datatime) {
        this.datatime = datatime;
    }

    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate;
    }

    public String getScover() {
        return scover;
    }

    public void setScover(String scover) {
        this.scover = scover;
    }

    public String getAutoid() {
        return autoid;
    }

    public void setAutoid(String autoid) {
        this.autoid = autoid;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getReporter() {
        return reporter;
    }

    public void setReporter(String reporter) {
        this.reporter = reporter;
    }

    public String getSetname() {
        return setname;
    }

    public void setSetname(String setname) {
        this.setname = setname;
    }

    public String getNeteasecode() {
        return neteasecode;
    }

    public void setNeteasecode(String neteasecode) {
        this.neteasecode = neteasecode;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public boolean isHideAd() {
        return hideAd;
    }

    public void setHideAd(boolean hideAd) {
        this.hideAd = hideAd;
    }

    public String getCommenturl() {
        return commenturl;
    }

    public void setCommenturl(String commenturl) {
        this.commenturl = commenturl;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSettag() {
        return settag;
    }

    public void setSettag(String settag) {
        this.settag = settag;
    }

    public String getBoardid() {
        return boardid;
    }

    public void setBoardid(String boardid) {
        this.boardid = boardid;
    }

    public String getTcover() {
        return tcover;
    }

    public void setTcover(String tcover) {
        this.tcover = tcover;
    }

    public String getImgsum() {
        return imgsum;
    }

    public void setImgsum(String imgsum) {
        this.imgsum = imgsum;
    }

    public List<?> getRelatedids() {
        return relatedids;
    }

    public void setRelatedids(List<?> relatedids) {
        this.relatedids = relatedids;
    }

    public List<PhotosBean> getPhotos() {
        return photos;
    }

    public void setPhotos(List<PhotosBean> photos) {
        this.photos = photos;
    }

    public static class PhotosBean {
        /**
         * timgurl : http://img4.cache.netease.com/photo/0001/2017-04-16/t_CI5B3HLD00AP0001.jpg
         * photohtml : http://news.163.com/photoview/00AP0001/2250173.html#p=CI5B3HLD00AP0001
         * newsurl : #
         * squareimgurl : http://img4.cache.netease.com/photo/0001/2017-04-16/400x400_CI5B3HLD00AP0001.jpg
         * cimgurl : http://img3.cache.netease.com/photo/0001/2017-04-16/c_CI5B3HLD00AP0001.jpg
         * imgtitle :
         * simgurl : http://img4.cache.netease.com/photo/0001/2017-04-16/s_CI5B3HLD00AP0001.jpg
         * note : 4月16日上午，四川达州的天空黑压压的，早晨9点却光线昏暗。达州人的朋友圈被黑云刷爆。（来源：四川日报）
         * photoid : CI5B3HLD00AP0001
         * imgurl : http://img3.cache.netease.com/photo/0001/2017-04-16/CI5B3HLD00AP0001.jpg
         */

        private String timgurl;
        private String photohtml;
        private String newsurl;
        private String squareimgurl;
        private String cimgurl;
        private String imgtitle;
        private String simgurl;
        private String note;
        private String photoid;
        private String imgurl;

        public String getTimgurl() {
            return timgurl;
        }

        public void setTimgurl(String timgurl) {
            this.timgurl = timgurl;
        }

        public String getPhotohtml() {
            return photohtml;
        }

        public void setPhotohtml(String photohtml) {
            this.photohtml = photohtml;
        }

        public String getNewsurl() {
            return newsurl;
        }

        public void setNewsurl(String newsurl) {
            this.newsurl = newsurl;
        }

        public String getSquareimgurl() {
            return squareimgurl;
        }

        public void setSquareimgurl(String squareimgurl) {
            this.squareimgurl = squareimgurl;
        }

        public String getCimgurl() {
            return cimgurl;
        }

        public void setCimgurl(String cimgurl) {
            this.cimgurl = cimgurl;
        }

        public String getImgtitle() {
            return imgtitle;
        }

        public void setImgtitle(String imgtitle) {
            this.imgtitle = imgtitle;
        }

        public String getSimgurl() {
            return simgurl;
        }

        public void setSimgurl(String simgurl) {
            this.simgurl = simgurl;
        }

        public String getNote() {
            return note;
        }

        public void setNote(String note) {
            this.note = note;
        }

        public String getPhotoid() {
            return photoid;
        }

        public void setPhotoid(String photoid) {
            this.photoid = photoid;
        }

        public String getImgurl() {
            return imgurl;
        }

        public void setImgurl(String imgurl) {
            this.imgurl = imgurl;
        }
    }
}
