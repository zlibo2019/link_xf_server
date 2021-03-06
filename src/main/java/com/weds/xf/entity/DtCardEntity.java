package com.weds.xf.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.weds.core.base.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Size;

public class DtCardEntity extends BaseEntity implements Serializable {
    /**
     *
     */
    @Size(max = 8)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String cardSerial;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer xh;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer lx;

    /**
     *
     */
    @Size(max = 50)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String glyNo;

    /**
     *
     */
    @Size(max = 50)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String cardPhoto;

    /**
     *
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(required = true, dataType = "string", example = "2020-03-22 11:14:18", value = "")
    private Date sj;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Long userSerial;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer cardLx;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer cardType;

    /**
     *
     */
    @Size(max = 50)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String cardHao;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer cardOrder;

    /**
     *
     */
    @Size(max = 200)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String cardBz;

    /**
     *
     */
    @Size(max = 50)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String cardVerify;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer readdCount;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer lossCount;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer cardWork;

    /**
     *
     */
    @Size(max = 50)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String cardForm;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer iscardreplace;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer iscarddel;

    /**
     */
    private static final long serialVersionUID = 1L;

    private String keys;

    /**
     * This method returns the value of the database column dt_card.card_serial
     *
     * @return the value of dt_card.card_serial
     */
    public String getCardSerial() {
        return cardSerial;
    }

    /**
     */
    public DtCardEntity withCardSerial(String cardSerial) {
        this.setCardSerial(cardSerial);
        return this;
    }

    /**
     * This method sets the value of the database column dt_card.card_serial
     *
     * @param cardSerial the value for dt_card.card_serial
     */
    public void setCardSerial(String cardSerial) {
        this.cardSerial = cardSerial;
    }

    /**
     * This method returns the value of the database column dt_card.xh
     *
     * @return the value of dt_card.xh
     */
    public Integer getXh() {
        return xh;
    }

    /**
     */
    public DtCardEntity withXh(Integer xh) {
        this.setXh(xh);
        return this;
    }

    /**
     * This method sets the value of the database column dt_card.xh
     *
     * @param xh the value for dt_card.xh
     */
    public void setXh(Integer xh) {
        this.xh = xh;
    }

    /**
     * This method returns the value of the database column dt_card.lx
     *
     * @return the value of dt_card.lx
     */
    public Integer getLx() {
        return lx;
    }

    /**
     */
    public DtCardEntity withLx(Integer lx) {
        this.setLx(lx);
        return this;
    }

    /**
     * This method sets the value of the database column dt_card.lx
     *
     * @param lx the value for dt_card.lx
     */
    public void setLx(Integer lx) {
        this.lx = lx;
    }

    /**
     * This method returns the value of the database column dt_card.gly_no
     *
     * @return the value of dt_card.gly_no
     */
    public String getGlyNo() {
        return glyNo;
    }

    /**
     */
    public DtCardEntity withGlyNo(String glyNo) {
        this.setGlyNo(glyNo);
        return this;
    }

    /**
     * This method sets the value of the database column dt_card.gly_no
     *
     * @param glyNo the value for dt_card.gly_no
     */
    public void setGlyNo(String glyNo) {
        this.glyNo = glyNo;
    }

    /**
     * This method returns the value of the database column dt_card.card_photo
     *
     * @return the value of dt_card.card_photo
     */
    public String getCardPhoto() {
        return cardPhoto;
    }

    /**
     */
    public DtCardEntity withCardPhoto(String cardPhoto) {
        this.setCardPhoto(cardPhoto);
        return this;
    }

    /**
     * This method sets the value of the database column dt_card.card_photo
     *
     * @param cardPhoto the value for dt_card.card_photo
     */
    public void setCardPhoto(String cardPhoto) {
        this.cardPhoto = cardPhoto;
    }

    /**
     * This method returns the value of the database column dt_card.sj
     *
     * @return the value of dt_card.sj
     */
    public Date getSj() {
        return sj;
    }

    /**
     */
    public DtCardEntity withSj(Date sj) {
        this.setSj(sj);
        return this;
    }

    /**
     * This method sets the value of the database column dt_card.sj
     *
     * @param sj the value for dt_card.sj
     */
    public void setSj(Date sj) {
        this.sj = sj;
    }

    /**
     * This method returns the value of the database column dt_card.user_serial
     *
     * @return the value of dt_card.user_serial
     */
    public Long getUserSerial() {
        return userSerial;
    }

    /**
     */
    public DtCardEntity withUserSerial(Long userSerial) {
        this.setUserSerial(userSerial);
        return this;
    }

    /**
     * This method sets the value of the database column dt_card.user_serial
     *
     * @param userSerial the value for dt_card.user_serial
     */
    public void setUserSerial(Long userSerial) {
        this.userSerial = userSerial;
    }

    /**
     * This method returns the value of the database column dt_card.card_lx
     *
     * @return the value of dt_card.card_lx
     */
    public Integer getCardLx() {
        return cardLx;
    }

    /**
     */
    public DtCardEntity withCardLx(Integer cardLx) {
        this.setCardLx(cardLx);
        return this;
    }

    /**
     * This method sets the value of the database column dt_card.card_lx
     *
     * @param cardLx the value for dt_card.card_lx
     */
    public void setCardLx(Integer cardLx) {
        this.cardLx = cardLx;
    }

    /**
     * This method returns the value of the database column dt_card.card_type
     *
     * @return the value of dt_card.card_type
     */
    public Integer getCardType() {
        return cardType;
    }

    /**
     */
    public DtCardEntity withCardType(Integer cardType) {
        this.setCardType(cardType);
        return this;
    }

    /**
     * This method sets the value of the database column dt_card.card_type
     *
     * @param cardType the value for dt_card.card_type
     */
    public void setCardType(Integer cardType) {
        this.cardType = cardType;
    }

    /**
     * This method returns the value of the database column dt_card.card_hao
     *
     * @return the value of dt_card.card_hao
     */
    public String getCardHao() {
        return cardHao;
    }

    /**
     */
    public DtCardEntity withCardHao(String cardHao) {
        this.setCardHao(cardHao);
        return this;
    }

    /**
     * This method sets the value of the database column dt_card.card_hao
     *
     * @param cardHao the value for dt_card.card_hao
     */
    public void setCardHao(String cardHao) {
        this.cardHao = cardHao;
    }

    /**
     * This method returns the value of the database column dt_card.card_order
     *
     * @return the value of dt_card.card_order
     */
    public Integer getCardOrder() {
        return cardOrder;
    }

    /**
     */
    public DtCardEntity withCardOrder(Integer cardOrder) {
        this.setCardOrder(cardOrder);
        return this;
    }

    /**
     * This method sets the value of the database column dt_card.card_order
     *
     * @param cardOrder the value for dt_card.card_order
     */
    public void setCardOrder(Integer cardOrder) {
        this.cardOrder = cardOrder;
    }

    /**
     * This method returns the value of the database column dt_card.card_bz
     *
     * @return the value of dt_card.card_bz
     */
    public String getCardBz() {
        return cardBz;
    }

    /**
     */
    public DtCardEntity withCardBz(String cardBz) {
        this.setCardBz(cardBz);
        return this;
    }

    /**
     * This method sets the value of the database column dt_card.card_bz
     *
     * @param cardBz the value for dt_card.card_bz
     */
    public void setCardBz(String cardBz) {
        this.cardBz = cardBz;
    }

    /**
     * This method returns the value of the database column dt_card.card_verify
     *
     * @return the value of dt_card.card_verify
     */
    public String getCardVerify() {
        return cardVerify;
    }

    /**
     */
    public DtCardEntity withCardVerify(String cardVerify) {
        this.setCardVerify(cardVerify);
        return this;
    }

    /**
     * This method sets the value of the database column dt_card.card_verify
     *
     * @param cardVerify the value for dt_card.card_verify
     */
    public void setCardVerify(String cardVerify) {
        this.cardVerify = cardVerify;
    }

    /**
     * This method returns the value of the database column dt_card.readd_count
     *
     * @return the value of dt_card.readd_count
     */
    public Integer getReaddCount() {
        return readdCount;
    }

    /**
     */
    public DtCardEntity withReaddCount(Integer readdCount) {
        this.setReaddCount(readdCount);
        return this;
    }

    /**
     * This method sets the value of the database column dt_card.readd_count
     *
     * @param readdCount the value for dt_card.readd_count
     */
    public void setReaddCount(Integer readdCount) {
        this.readdCount = readdCount;
    }

    /**
     * This method returns the value of the database column dt_card.loss_count
     *
     * @return the value of dt_card.loss_count
     */
    public Integer getLossCount() {
        return lossCount;
    }

    /**
     */
    public DtCardEntity withLossCount(Integer lossCount) {
        this.setLossCount(lossCount);
        return this;
    }

    /**
     * This method sets the value of the database column dt_card.loss_count
     *
     * @param lossCount the value for dt_card.loss_count
     */
    public void setLossCount(Integer lossCount) {
        this.lossCount = lossCount;
    }

    /**
     * This method returns the value of the database column dt_card.Card_work
     *
     * @return the value of dt_card.Card_work
     */
    public Integer getCardWork() {
        return cardWork;
    }

    /**
     */
    public DtCardEntity withCardWork(Integer cardWork) {
        this.setCardWork(cardWork);
        return this;
    }

    /**
     * This method sets the value of the database column dt_card.Card_work
     *
     * @param cardWork the value for dt_card.Card_work
     */
    public void setCardWork(Integer cardWork) {
        this.cardWork = cardWork;
    }

    /**
     * This method returns the value of the database column dt_card.card_form
     *
     * @return the value of dt_card.card_form
     */
    public String getCardForm() {
        return cardForm;
    }

    /**
     */
    public DtCardEntity withCardForm(String cardForm) {
        this.setCardForm(cardForm);
        return this;
    }

    /**
     * This method sets the value of the database column dt_card.card_form
     *
     * @param cardForm the value for dt_card.card_form
     */
    public void setCardForm(String cardForm) {
        this.cardForm = cardForm;
    }

    /**
     * This method returns the value of the database column dt_card.isCardReplace
     *
     * @return the value of dt_card.isCardReplace
     */
    public Integer getIscardreplace() {
        return iscardreplace;
    }

    /**
     */
    public DtCardEntity withIscardreplace(Integer iscardreplace) {
        this.setIscardreplace(iscardreplace);
        return this;
    }

    /**
     * This method sets the value of the database column dt_card.isCardReplace
     *
     * @param iscardreplace the value for dt_card.isCardReplace
     */
    public void setIscardreplace(Integer iscardreplace) {
        this.iscardreplace = iscardreplace;
    }

    /**
     * This method returns the value of the database column dt_card.iscarddel
     *
     * @return the value of dt_card.iscarddel
     */
    public Integer getIscarddel() {
        return iscarddel;
    }

    /**
     */
    public DtCardEntity withIscarddel(Integer iscarddel) {
        this.setIscarddel(iscarddel);
        return this;
    }

    /**
     * This method sets the value of the database column dt_card.iscarddel
     *
     * @param iscarddel the value for dt_card.iscarddel
     */
    public void setIscarddel(Integer iscarddel) {
        this.iscarddel = iscarddel;
    }

    public String getKeys() {
        return keys;
    }

    public void setKeys(String keys) {
        this.keys = keys;
    }
}