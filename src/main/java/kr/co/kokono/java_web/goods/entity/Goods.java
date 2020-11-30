package kr.co.kokono.java_web.goods.entity;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter @Setter
public class Goods {

    private Long goodsId;
    private String goodsTitle;
    private String goodsWriter;
    private int goodsPrice;
    private String goodsPublisher;
    private String goodsSort;
    private int goodsSalesPrice;
    private int goodsPoint;
    private LocalDateTime goodsPublishedDate;
    private int goodsTotalPage;
    private String goodsIsbn;
    private String goodsDeliveryPrice;
    private LocalDateTime goodsDeliveryDate;
    private String goodsFileName;
    private String goodsStatus;
    private String goodsWriterIntro;
    private String goodsContentsOrder;
    private String goodsIntro;
    private String goodsPublisherComment;
    private String goodsRecommendation;
    private LocalDateTime goodsCreatedAt;
}
