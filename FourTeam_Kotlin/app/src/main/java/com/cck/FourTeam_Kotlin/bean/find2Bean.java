package com.cck.FourTeam_Kotlin.bean;

import java.util.List;

/**
 * Created by C-PC on 2017/12/28.
 */

public class find2Bean extends BaseBean{



    private int count;
    private int total;
    private String nextPageUrl;
    private boolean adExist;
    private List<ItemListBean> itemList;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getNextPageUrl() {
        return nextPageUrl;
    }

    public void setNextPageUrl(String nextPageUrl) {
        this.nextPageUrl = nextPageUrl;
    }

    public boolean isAdExist() {
        return adExist;
    }

    public void setAdExist(boolean adExist) {
        this.adExist = adExist;
    }

    public List<ItemListBean> getItemList() {
        return itemList;
    }

    public void setItemList(List<ItemListBean> itemList) {
        this.itemList = itemList;
    }

    public static class ItemListBean {
        /**
         * type : video
         * data : {"dataType":"VideoBeanForClient","id":69903,"title":"学会这个发型让你秒变\u201c森系女神\u201d","slogan":null,"description":"专业编发师力荐！元旦节，学会这个发型让你秒变\u201c森系女神\u201d","provider":{"name":"PGC","alias":"PGC","icon":""},"category":"时尚","author":{"id":1664,"icon":"http://img.kaiyanapp.com/29b4b68d7210ece1cba8e45ab10ce349.png?imageMogr2/quality/60/format/jpg","name":"樱桃来了INTAO","description":"这里是颇具逼格的时尚小课堂，生产关于熊孩纸发型、妆扮、搭配方面的有趣内容。\n","link":"","latestReleaseTime":1514378134000,"videoNum":19,"adTrack":null,"follow":{"itemType":"author","itemId":1664,"followed":false},"shield":{"itemType":"author","itemId":1664,"shielded":false},"approvedNotReadyVideoCount":0,"ifPgc":true},"cover":{"feed":"http://img.kaiyanapp.com/b2c4d7e2b0af71c7d369fd78ed56419e.png?imageMogr2/quality/60/format/jpg","detail":"http://img.kaiyanapp.com/b2c4d7e2b0af71c7d369fd78ed56419e.png?imageMogr2/quality/60/format/jpg","blurred":"http://img.kaiyanapp.com/b9279b20713fe78f8445d6f6d113f319.jpeg?imageMogr2/quality/60/format/jpg","sharing":null,"homepage":null},"playUrl":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=69903&editionType=default&source=aliyun","thumbPlayUrl":null,"duration":96,"webUrl":{"raw":"http://www.eyepetizer.net/detail.html?vid=69903","forWeibo":"http://www.eyepetizer.net/detail.html?vid=69903"},"releaseTime":1514378134000,"library":"DEFAULT","playInfo":[{"height":480,"width":854,"urlList":[{"name":"aliyun","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=69903&editionType=normal&source=aliyun","size":7256297},{"name":"qcloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=69903&editionType=normal&source=qcloud","size":7256297},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=69903&editionType=normal&source=ucloud","size":7256297}],"name":"标清","type":"normal","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=69903&editionType=normal&source=aliyun"},{"height":720,"width":1280,"urlList":[{"name":"aliyun","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=69903&editionType=high&source=aliyun","size":11704649},{"name":"qcloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=69903&editionType=high&source=qcloud","size":11704649},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=69903&editionType=high&source=ucloud","size":11704649}],"name":"高清","type":"high","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=69903&editionType=high&source=aliyun"}],"consumption":{"collectionCount":4,"shareCount":6,"replyCount":0},"campaign":null,"waterMarks":null,"adTrack":null,"tags":[{"id":46,"name":"教程","actionUrl":"eyepetizer://tag/46/?title=%E6%95%99%E7%A8%8B","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/ca40278cd698aec9997985139ae05007.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/ca40278cd698aec9997985139ae05007.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL"},{"id":152,"name":"童趣","actionUrl":"eyepetizer://tag/152/?title=%E7%AB%A5%E8%B6%A3","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/7c804af18adac2028b220651621bad87.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/7c804af18adac2028b220651621bad87.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL"},{"id":26,"name":"时尚","actionUrl":"eyepetizer://tag/26/?title=%E6%97%B6%E5%B0%9A","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/34b720d05d98c905432e9906d5b9cdf7.jpeg?imageMogr2/quality/100","headerImage":"http://img.kaiyanapp.com/34b720d05d98c905432e9906d5b9cdf7.jpeg?imageMogr2/quality/100","tagRecType":"NORMAL"}],"type":"NORMAL","titlePgc":"学会这个发型让你秒变\u201c森系女神\u201d","descriptionPgc":"专业编发师力荐！元旦节，学会这个发型让你秒变\u201c森系女神\u201d","remark":"","idx":0,"shareAdTrack":null,"favoriteAdTrack":null,"webAdTrack":null,"date":1514378134000,"promotion":null,"label":null,"labelList":[],"descriptionEditor":"","collected":false,"played":false,"subtitles":[],"lastViewTime":null,"playlists":null,"src":null}
         * tag : null
         * id : 0
         * adIndex : -1
         */

        private String type;
        private DataBean data;
        private Object tag;
        private int id;
        private int adIndex;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public DataBean getData() {
            return data;
        }

        public void setData(DataBean data) {
            this.data = data;
        }

        public Object getTag() {
            return tag;
        }

        public void setTag(Object tag) {
            this.tag = tag;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getAdIndex() {
            return adIndex;
        }

        public void setAdIndex(int adIndex) {
            this.adIndex = adIndex;
        }

        public static class DataBean {
            /**
             * dataType : VideoBeanForClient
             * id : 69903
             * title : 学会这个发型让你秒变“森系女神”
             * slogan : null
             * description : 专业编发师力荐！元旦节，学会这个发型让你秒变“森系女神”
             * provider : {"name":"PGC","alias":"PGC","icon":""}
             * category : 时尚
             * author : {"id":1664,"icon":"http://img.kaiyanapp.com/29b4b68d7210ece1cba8e45ab10ce349.png?imageMogr2/quality/60/format/jpg","name":"樱桃来了INTAO","description":"这里是颇具逼格的时尚小课堂，生产关于熊孩纸发型、妆扮、搭配方面的有趣内容。\n","link":"","latestReleaseTime":1514378134000,"videoNum":19,"adTrack":null,"follow":{"itemType":"author","itemId":1664,"followed":false},"shield":{"itemType":"author","itemId":1664,"shielded":false},"approvedNotReadyVideoCount":0,"ifPgc":true}
             * cover : {"feed":"http://img.kaiyanapp.com/b2c4d7e2b0af71c7d369fd78ed56419e.png?imageMogr2/quality/60/format/jpg","detail":"http://img.kaiyanapp.com/b2c4d7e2b0af71c7d369fd78ed56419e.png?imageMogr2/quality/60/format/jpg","blurred":"http://img.kaiyanapp.com/b9279b20713fe78f8445d6f6d113f319.jpeg?imageMogr2/quality/60/format/jpg","sharing":null,"homepage":null}
             * playUrl : http://baobab.kaiyanapp.com/api/v1/playUrl?vid=69903&editionType=default&source=aliyun
             * thumbPlayUrl : null
             * duration : 96
             * webUrl : {"raw":"http://www.eyepetizer.net/detail.html?vid=69903","forWeibo":"http://www.eyepetizer.net/detail.html?vid=69903"}
             * releaseTime : 1514378134000
             * library : DEFAULT
             * playInfo : [{"height":480,"width":854,"urlList":[{"name":"aliyun","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=69903&editionType=normal&source=aliyun","size":7256297},{"name":"qcloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=69903&editionType=normal&source=qcloud","size":7256297},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=69903&editionType=normal&source=ucloud","size":7256297}],"name":"标清","type":"normal","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=69903&editionType=normal&source=aliyun"},{"height":720,"width":1280,"urlList":[{"name":"aliyun","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=69903&editionType=high&source=aliyun","size":11704649},{"name":"qcloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=69903&editionType=high&source=qcloud","size":11704649},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=69903&editionType=high&source=ucloud","size":11704649}],"name":"高清","type":"high","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=69903&editionType=high&source=aliyun"}]
             * consumption : {"collectionCount":4,"shareCount":6,"replyCount":0}
             * campaign : null
             * waterMarks : null
             * adTrack : null
             * tags : [{"id":46,"name":"教程","actionUrl":"eyepetizer://tag/46/?title=%E6%95%99%E7%A8%8B","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/ca40278cd698aec9997985139ae05007.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/ca40278cd698aec9997985139ae05007.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL"},{"id":152,"name":"童趣","actionUrl":"eyepetizer://tag/152/?title=%E7%AB%A5%E8%B6%A3","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/7c804af18adac2028b220651621bad87.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/7c804af18adac2028b220651621bad87.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL"},{"id":26,"name":"时尚","actionUrl":"eyepetizer://tag/26/?title=%E6%97%B6%E5%B0%9A","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/34b720d05d98c905432e9906d5b9cdf7.jpeg?imageMogr2/quality/100","headerImage":"http://img.kaiyanapp.com/34b720d05d98c905432e9906d5b9cdf7.jpeg?imageMogr2/quality/100","tagRecType":"NORMAL"}]
             * type : NORMAL
             * titlePgc : 学会这个发型让你秒变“森系女神”
             * descriptionPgc : 专业编发师力荐！元旦节，学会这个发型让你秒变“森系女神”
             * remark :
             * idx : 0
             * shareAdTrack : null
             * favoriteAdTrack : null
             * webAdTrack : null
             * date : 1514378134000
             * promotion : null
             * label : null
             * labelList : []
             * descriptionEditor :
             * collected : false
             * played : false
             * subtitles : []
             * lastViewTime : null
             * playlists : null
             * src : null
             */

            private String dataType;
            private int id;
            private String title;
            private Object slogan;
            private String description;
            private ProviderBean provider;
            private String category;
            private AuthorBean author;
            private CoverBean cover;
            private String playUrl;
            private Object thumbPlayUrl;
            private int duration;
            private WebUrlBean webUrl;
            private long releaseTime;
            private String library;
            private ConsumptionBean consumption;
            private Object campaign;
            private Object waterMarks;
            private Object adTrack;
            private String type;
            private String titlePgc;
            private String descriptionPgc;
            private String remark;
            private int idx;
            private Object shareAdTrack;
            private Object favoriteAdTrack;
            private Object webAdTrack;
            private long date;
            private Object promotion;
            private Object label;
            private String descriptionEditor;
            private boolean collected;
            private boolean played;
            private Object lastViewTime;
            private Object playlists;
            private Object src;
            private List<PlayInfoBean> playInfo;
            private List<TagsBean> tags;
            private List<?> labelList;
            private List<?> subtitles;

            public String getDataType() {
                return dataType;
            }

            public void setDataType(String dataType) {
                this.dataType = dataType;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public Object getSlogan() {
                return slogan;
            }

            public void setSlogan(Object slogan) {
                this.slogan = slogan;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public ProviderBean getProvider() {
                return provider;
            }

            public void setProvider(ProviderBean provider) {
                this.provider = provider;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public AuthorBean getAuthor() {
                return author;
            }

            public void setAuthor(AuthorBean author) {
                this.author = author;
            }

            public CoverBean getCover() {
                return cover;
            }

            public void setCover(CoverBean cover) {
                this.cover = cover;
            }

            public String getPlayUrl() {
                return playUrl;
            }

            public void setPlayUrl(String playUrl) {
                this.playUrl = playUrl;
            }

            public Object getThumbPlayUrl() {
                return thumbPlayUrl;
            }

            public void setThumbPlayUrl(Object thumbPlayUrl) {
                this.thumbPlayUrl = thumbPlayUrl;
            }

            public int getDuration() {
                return duration;
            }

            public void setDuration(int duration) {
                this.duration = duration;
            }

            public WebUrlBean getWebUrl() {
                return webUrl;
            }

            public void setWebUrl(WebUrlBean webUrl) {
                this.webUrl = webUrl;
            }

            public long getReleaseTime() {
                return releaseTime;
            }

            public void setReleaseTime(long releaseTime) {
                this.releaseTime = releaseTime;
            }

            public String getLibrary() {
                return library;
            }

            public void setLibrary(String library) {
                this.library = library;
            }

            public ConsumptionBean getConsumption() {
                return consumption;
            }

            public void setConsumption(ConsumptionBean consumption) {
                this.consumption = consumption;
            }

            public Object getCampaign() {
                return campaign;
            }

            public void setCampaign(Object campaign) {
                this.campaign = campaign;
            }

            public Object getWaterMarks() {
                return waterMarks;
            }

            public void setWaterMarks(Object waterMarks) {
                this.waterMarks = waterMarks;
            }

            public Object getAdTrack() {
                return adTrack;
            }

            public void setAdTrack(Object adTrack) {
                this.adTrack = adTrack;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getTitlePgc() {
                return titlePgc;
            }

            public void setTitlePgc(String titlePgc) {
                this.titlePgc = titlePgc;
            }

            public String getDescriptionPgc() {
                return descriptionPgc;
            }

            public void setDescriptionPgc(String descriptionPgc) {
                this.descriptionPgc = descriptionPgc;
            }

            public String getRemark() {
                return remark;
            }

            public void setRemark(String remark) {
                this.remark = remark;
            }

            public int getIdx() {
                return idx;
            }

            public void setIdx(int idx) {
                this.idx = idx;
            }

            public Object getShareAdTrack() {
                return shareAdTrack;
            }

            public void setShareAdTrack(Object shareAdTrack) {
                this.shareAdTrack = shareAdTrack;
            }

            public Object getFavoriteAdTrack() {
                return favoriteAdTrack;
            }

            public void setFavoriteAdTrack(Object favoriteAdTrack) {
                this.favoriteAdTrack = favoriteAdTrack;
            }

            public Object getWebAdTrack() {
                return webAdTrack;
            }

            public void setWebAdTrack(Object webAdTrack) {
                this.webAdTrack = webAdTrack;
            }

            public long getDate() {
                return date;
            }

            public void setDate(long date) {
                this.date = date;
            }

            public Object getPromotion() {
                return promotion;
            }

            public void setPromotion(Object promotion) {
                this.promotion = promotion;
            }

            public Object getLabel() {
                return label;
            }

            public void setLabel(Object label) {
                this.label = label;
            }

            public String getDescriptionEditor() {
                return descriptionEditor;
            }

            public void setDescriptionEditor(String descriptionEditor) {
                this.descriptionEditor = descriptionEditor;
            }

            public boolean isCollected() {
                return collected;
            }

            public void setCollected(boolean collected) {
                this.collected = collected;
            }

            public boolean isPlayed() {
                return played;
            }

            public void setPlayed(boolean played) {
                this.played = played;
            }

            public Object getLastViewTime() {
                return lastViewTime;
            }

            public void setLastViewTime(Object lastViewTime) {
                this.lastViewTime = lastViewTime;
            }

            public Object getPlaylists() {
                return playlists;
            }

            public void setPlaylists(Object playlists) {
                this.playlists = playlists;
            }

            public Object getSrc() {
                return src;
            }

            public void setSrc(Object src) {
                this.src = src;
            }

            public List<PlayInfoBean> getPlayInfo() {
                return playInfo;
            }

            public void setPlayInfo(List<PlayInfoBean> playInfo) {
                this.playInfo = playInfo;
            }

            public List<TagsBean> getTags() {
                return tags;
            }

            public void setTags(List<TagsBean> tags) {
                this.tags = tags;
            }

            public List<?> getLabelList() {
                return labelList;
            }

            public void setLabelList(List<?> labelList) {
                this.labelList = labelList;
            }

            public List<?> getSubtitles() {
                return subtitles;
            }

            public void setSubtitles(List<?> subtitles) {
                this.subtitles = subtitles;
            }

            public static class ProviderBean {
                /**
                 * name : PGC
                 * alias : PGC
                 * icon :
                 */

                private String name;
                private String alias;
                private String icon;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getAlias() {
                    return alias;
                }

                public void setAlias(String alias) {
                    this.alias = alias;
                }

                public String getIcon() {
                    return icon;
                }

                public void setIcon(String icon) {
                    this.icon = icon;
                }
            }

            public static class AuthorBean {
                /**
                 * id : 1664
                 * icon : http://img.kaiyanapp.com/29b4b68d7210ece1cba8e45ab10ce349.png?imageMogr2/quality/60/format/jpg
                 * name : 樱桃来了INTAO
                 * description : 这里是颇具逼格的时尚小课堂，生产关于熊孩纸发型、妆扮、搭配方面的有趣内容。

                 * link :
                 * latestReleaseTime : 1514378134000
                 * videoNum : 19
                 * adTrack : null
                 * follow : {"itemType":"author","itemId":1664,"followed":false}
                 * shield : {"itemType":"author","itemId":1664,"shielded":false}
                 * approvedNotReadyVideoCount : 0
                 * ifPgc : true
                 */

                private int id;
                private String icon;
                private String name;
                private String description;
                private String link;
                private long latestReleaseTime;
                private int videoNum;
                private Object adTrack;
                private FollowBean follow;
                private ShieldBean shield;
                private int approvedNotReadyVideoCount;
                private boolean ifPgc;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getIcon() {
                    return icon;
                }

                public void setIcon(String icon) {
                    this.icon = icon;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getDescription() {
                    return description;
                }

                public void setDescription(String description) {
                    this.description = description;
                }

                public String getLink() {
                    return link;
                }

                public void setLink(String link) {
                    this.link = link;
                }

                public long getLatestReleaseTime() {
                    return latestReleaseTime;
                }

                public void setLatestReleaseTime(long latestReleaseTime) {
                    this.latestReleaseTime = latestReleaseTime;
                }

                public int getVideoNum() {
                    return videoNum;
                }

                public void setVideoNum(int videoNum) {
                    this.videoNum = videoNum;
                }

                public Object getAdTrack() {
                    return adTrack;
                }

                public void setAdTrack(Object adTrack) {
                    this.adTrack = adTrack;
                }

                public FollowBean getFollow() {
                    return follow;
                }

                public void setFollow(FollowBean follow) {
                    this.follow = follow;
                }

                public ShieldBean getShield() {
                    return shield;
                }

                public void setShield(ShieldBean shield) {
                    this.shield = shield;
                }

                public int getApprovedNotReadyVideoCount() {
                    return approvedNotReadyVideoCount;
                }

                public void setApprovedNotReadyVideoCount(int approvedNotReadyVideoCount) {
                    this.approvedNotReadyVideoCount = approvedNotReadyVideoCount;
                }

                public boolean isIfPgc() {
                    return ifPgc;
                }

                public void setIfPgc(boolean ifPgc) {
                    this.ifPgc = ifPgc;
                }

                public static class FollowBean {
                    /**
                     * itemType : author
                     * itemId : 1664
                     * followed : false
                     */

                    private String itemType;
                    private int itemId;
                    private boolean followed;

                    public String getItemType() {
                        return itemType;
                    }

                    public void setItemType(String itemType) {
                        this.itemType = itemType;
                    }

                    public int getItemId() {
                        return itemId;
                    }

                    public void setItemId(int itemId) {
                        this.itemId = itemId;
                    }

                    public boolean isFollowed() {
                        return followed;
                    }

                    public void setFollowed(boolean followed) {
                        this.followed = followed;
                    }
                }

                public static class ShieldBean {
                    /**
                     * itemType : author
                     * itemId : 1664
                     * shielded : false
                     */

                    private String itemType;
                    private int itemId;
                    private boolean shielded;

                    public String getItemType() {
                        return itemType;
                    }

                    public void setItemType(String itemType) {
                        this.itemType = itemType;
                    }

                    public int getItemId() {
                        return itemId;
                    }

                    public void setItemId(int itemId) {
                        this.itemId = itemId;
                    }

                    public boolean isShielded() {
                        return shielded;
                    }

                    public void setShielded(boolean shielded) {
                        this.shielded = shielded;
                    }
                }
            }

            public static class CoverBean {
                /**
                 * feed : http://img.kaiyanapp.com/b2c4d7e2b0af71c7d369fd78ed56419e.png?imageMogr2/quality/60/format/jpg
                 * detail : http://img.kaiyanapp.com/b2c4d7e2b0af71c7d369fd78ed56419e.png?imageMogr2/quality/60/format/jpg
                 * blurred : http://img.kaiyanapp.com/b9279b20713fe78f8445d6f6d113f319.jpeg?imageMogr2/quality/60/format/jpg
                 * sharing : null
                 * homepage : null
                 */

                private String feed;
                private String detail;
                private String blurred;
                private Object sharing;
                private Object homepage;

                public String getFeed() {
                    return feed;
                }

                public void setFeed(String feed) {
                    this.feed = feed;
                }

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getBlurred() {
                    return blurred;
                }

                public void setBlurred(String blurred) {
                    this.blurred = blurred;
                }

                public Object getSharing() {
                    return sharing;
                }

                public void setSharing(Object sharing) {
                    this.sharing = sharing;
                }

                public Object getHomepage() {
                    return homepage;
                }

                public void setHomepage(Object homepage) {
                    this.homepage = homepage;
                }
            }

            public static class WebUrlBean {
                /**
                 * raw : http://www.eyepetizer.net/detail.html?vid=69903
                 * forWeibo : http://www.eyepetizer.net/detail.html?vid=69903
                 */

                private String raw;
                private String forWeibo;

                public String getRaw() {
                    return raw;
                }

                public void setRaw(String raw) {
                    this.raw = raw;
                }

                public String getForWeibo() {
                    return forWeibo;
                }

                public void setForWeibo(String forWeibo) {
                    this.forWeibo = forWeibo;
                }
            }

            public static class ConsumptionBean {
                /**
                 * collectionCount : 4
                 * shareCount : 6
                 * replyCount : 0
                 */

                private int collectionCount;
                private int shareCount;
                private int replyCount;

                public int getCollectionCount() {
                    return collectionCount;
                }

                public void setCollectionCount(int collectionCount) {
                    this.collectionCount = collectionCount;
                }

                public int getShareCount() {
                    return shareCount;
                }

                public void setShareCount(int shareCount) {
                    this.shareCount = shareCount;
                }

                public int getReplyCount() {
                    return replyCount;
                }

                public void setReplyCount(int replyCount) {
                    this.replyCount = replyCount;
                }
            }

            public static class PlayInfoBean {
                /**
                 * height : 480
                 * width : 854
                 * urlList : [{"name":"aliyun","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=69903&editionType=normal&source=aliyun","size":7256297},{"name":"qcloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=69903&editionType=normal&source=qcloud","size":7256297},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=69903&editionType=normal&source=ucloud","size":7256297}]
                 * name : 标清
                 * type : normal
                 * url : http://baobab.kaiyanapp.com/api/v1/playUrl?vid=69903&editionType=normal&source=aliyun
                 */

                private int height;
                private int width;
                private String name;
                private String type;
                private String url;
                private List<UrlListBean> urlList;

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public List<UrlListBean> getUrlList() {
                    return urlList;
                }

                public void setUrlList(List<UrlListBean> urlList) {
                    this.urlList = urlList;
                }

                public static class UrlListBean {
                    /**
                     * name : aliyun
                     * url : http://baobab.kaiyanapp.com/api/v1/playUrl?vid=69903&editionType=normal&source=aliyun
                     * size : 7256297
                     */

                    private String name;
                    private String url;
                    private int size;

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public int getSize() {
                        return size;
                    }

                    public void setSize(int size) {
                        this.size = size;
                    }
                }
            }

            public static class TagsBean {
                /**
                 * id : 46
                 * name : 教程
                 * actionUrl : eyepetizer://tag/46/?title=%E6%95%99%E7%A8%8B
                 * adTrack : null
                 * desc : null
                 * bgPicture : http://img.kaiyanapp.com/ca40278cd698aec9997985139ae05007.jpeg?imageMogr2/quality/60/format/jpg
                 * headerImage : http://img.kaiyanapp.com/ca40278cd698aec9997985139ae05007.jpeg?imageMogr2/quality/60/format/jpg
                 * tagRecType : NORMAL
                 */

                private int id;
                private String name;
                private String actionUrl;
                private Object adTrack;
                private Object desc;
                private String bgPicture;
                private String headerImage;
                private String tagRecType;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getActionUrl() {
                    return actionUrl;
                }

                public void setActionUrl(String actionUrl) {
                    this.actionUrl = actionUrl;
                }

                public Object getAdTrack() {
                    return adTrack;
                }

                public void setAdTrack(Object adTrack) {
                    this.adTrack = adTrack;
                }

                public Object getDesc() {
                    return desc;
                }

                public void setDesc(Object desc) {
                    this.desc = desc;
                }

                public String getBgPicture() {
                    return bgPicture;
                }

                public void setBgPicture(String bgPicture) {
                    this.bgPicture = bgPicture;
                }

                public String getHeaderImage() {
                    return headerImage;
                }

                public void setHeaderImage(String headerImage) {
                    this.headerImage = headerImage;
                }

                public String getTagRecType() {
                    return tagRecType;
                }

                public void setTagRecType(String tagRecType) {
                    this.tagRecType = tagRecType;
                }
            }
        }
    }
}
