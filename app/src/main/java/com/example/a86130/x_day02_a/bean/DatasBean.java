package com.example.a86130.x_day02_a.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;

import java.util.List;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by 86130 on 2019/9/20.
 */
@Entity
public  class DatasBean {
    /**
     * id : 296282
     * uid : 1081365
     * name :
     * title : 如何创作艺术
     就是怎样生活
     * excerpt : 探索那叫你写的缘由，考察它的根是不是盘在你心的深处；你要坦白承认，万一你写不出来，是不是必得因此而死去。
     * lead : 对于一个刚刚跨入创作门槛的人而言，很难不把讨好他人放在过分重要的位置，仿佛作品有无价值全凭别人的一句评价。诗人莱纳·玛利亚·里尔克就收到过这样一位青年诗人的来信，惴惴不安地询问自己的诗艺到底好不好。里尔克直截了当地劝告他，停止向外看，走向自己的内心吧！往后，二人时不时地互通信件。
     里尔克留下了十封信，在他的论述中，艺术创作和日常生活是一体的，如何创作艺术就是怎样生活，好的作品是挖掘生活深处后的“必须”。因此里尔克在告知创作要诀时，也耐心回应了青年人常有的人生困惑：感官的快感，抑或精神的重负，这些体验都无需诋毁、厌弃，因为它们都通向生活内在的丰富，当真实的生活自然地生长起来时，比起那些高深、复杂的阐释，都要更为接近艺术。
     在信件中热心为他人排忧解难的里尔克会让人误以为彼时他已是一位饱经沧桑的老人，所以才能对生命的本质有如此清醒而深刻的认识，但其实里尔克写作这些信件时，也不过三十岁左右。对今天的青年人来说，不管是否有志于从事艺术创作，如果有意谴责自己的生活，仍能从他绵柔却坚韧的字句里得到宽慰，“寂寞而勇敢地生活在任何一处无情的现实中”。
     * model : 1
     * position : 0
     * thumbnail : https://img.owspace.com/Public/uploads/Picture/2019-09-19/5d83941422b01.jpg
     * create_time : 1568939400
     * update_time : 2019/09/20
     * tags : [{"name":""}]
     * status : 1
     * video :
     * fm :
     * link_url :
     * publish_time : 0
     * view : 2.7w
     * share : http://static.owspace.com/wap/296282.html
     * comment : 4
     * good : 11
     * bookmark : 0
     * show_uid : 1081365
     * fm_play :
     * lunar_type : 1
     * hot_comments : []
     * html5 : http://static.owspace.com/wap/296282.html
     * author : 莱内·马利亚·里尔克
     * tpl : 1
     * avatar : https://img.owspace.com/Public/static/avatar/4.png
     * discover : 0
     * category : TO READ
     * parseXML : 1
     */
@Id
    private Long id;
    private String uid;
    private String name;
    private String title;
    private String excerpt;
    private String lead;
    private String model;
    private String position;
    private String thumbnail;
    private String create_time;
    private String update_time;
    private String status;
    private String video;
    private String fm;
    private String link_url;
    private String publish_time;
    private String view;
    private String share;
    private String comment;
    private String good;
    private String bookmark;
    private String show_uid;
    private String fm_play;
    private String lunar_type;
    private String html5;
    private String author;
    private int tpl;
    private String avatar;
    private String discover;
    private String category;
    private int parseXML;
    @Generated(hash = 1428627153)
    public DatasBean(Long id, String uid, String name, String title, String excerpt, String lead, String model, String position, String thumbnail, String create_time,
            String update_time, String status, String video, String fm, String link_url, String publish_time, String view, String share, String comment, String good, String bookmark,
            String show_uid, String fm_play, String lunar_type, String html5, String author, int tpl, String avatar, String discover, String category, int parseXML) {
        this.id = id;
        this.uid = uid;
        this.name = name;
        this.title = title;
        this.excerpt = excerpt;
        this.lead = lead;
        this.model = model;
        this.position = position;
        this.thumbnail = thumbnail;
        this.create_time = create_time;
        this.update_time = update_time;
        this.status = status;
        this.video = video;
        this.fm = fm;
        this.link_url = link_url;
        this.publish_time = publish_time;
        this.view = view;
        this.share = share;
        this.comment = comment;
        this.good = good;
        this.bookmark = bookmark;
        this.show_uid = show_uid;
        this.fm_play = fm_play;
        this.lunar_type = lunar_type;
        this.html5 = html5;
        this.author = author;
        this.tpl = tpl;
        this.avatar = avatar;
        this.discover = discover;
        this.category = category;
        this.parseXML = parseXML;
    }
    @Generated(hash = 128729784)
    public DatasBean() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getUid() {
        return this.uid;
    }
    public void setUid(String uid) {
        this.uid = uid;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getExcerpt() {
        return this.excerpt;
    }
    public void setExcerpt(String excerpt) {
        this.excerpt = excerpt;
    }
    public String getLead() {
        return this.lead;
    }
    public void setLead(String lead) {
        this.lead = lead;
    }
    public String getModel() {
        return this.model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getPosition() {
        return this.position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public String getThumbnail() {
        return this.thumbnail;
    }
    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }
    public String getCreate_time() {
        return this.create_time;
    }
    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }
    public String getUpdate_time() {
        return this.update_time;
    }
    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
    }
    public String getStatus() {
        return this.status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getVideo() {
        return this.video;
    }
    public void setVideo(String video) {
        this.video = video;
    }
    public String getFm() {
        return this.fm;
    }
    public void setFm(String fm) {
        this.fm = fm;
    }
    public String getLink_url() {
        return this.link_url;
    }
    public void setLink_url(String link_url) {
        this.link_url = link_url;
    }
    public String getPublish_time() {
        return this.publish_time;
    }
    public void setPublish_time(String publish_time) {
        this.publish_time = publish_time;
    }
    public String getView() {
        return this.view;
    }
    public void setView(String view) {
        this.view = view;
    }
    public String getShare() {
        return this.share;
    }
    public void setShare(String share) {
        this.share = share;
    }
    public String getComment() {
        return this.comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }
    public String getGood() {
        return this.good;
    }
    public void setGood(String good) {
        this.good = good;
    }
    public String getBookmark() {
        return this.bookmark;
    }
    public void setBookmark(String bookmark) {
        this.bookmark = bookmark;
    }
    public String getShow_uid() {
        return this.show_uid;
    }
    public void setShow_uid(String show_uid) {
        this.show_uid = show_uid;
    }
    public String getFm_play() {
        return this.fm_play;
    }
    public void setFm_play(String fm_play) {
        this.fm_play = fm_play;
    }
    public String getLunar_type() {
        return this.lunar_type;
    }
    public void setLunar_type(String lunar_type) {
        this.lunar_type = lunar_type;
    }
    public String getHtml5() {
        return this.html5;
    }
    public void setHtml5(String html5) {
        this.html5 = html5;
    }
    public String getAuthor() {
        return this.author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getTpl() {
        return this.tpl;
    }
    public void setTpl(int tpl) {
        this.tpl = tpl;
    }
    public String getAvatar() {
        return this.avatar;
    }
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
    public String getDiscover() {
        return this.discover;
    }
    public void setDiscover(String discover) {
        this.discover = discover;
    }
    public String getCategory() {
        return this.category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public int getParseXML() {
        return this.parseXML;
    }
    public void setParseXML(int parseXML) {
        this.parseXML = parseXML;
    }
    

}
