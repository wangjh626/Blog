package com.wangjh.blog.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Article implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.id
     *
     * @mbg.generated Fri Aug 16 15:25:34 CST 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.author
     *
     * @mbg.generated Fri Aug 16 15:25:34 CST 2019
     */
    private String author;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.article_title
     *
     * @mbg.generated Fri Aug 16 15:25:34 CST 2019
     */
    private String articleTitle;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.article_content
     *
     * @mbg.generated Fri Aug 16 15:25:34 CST 2019
     */
    private String articleContent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.article_categories
     *
     * @mbg.generated Fri Aug 16 15:25:34 CST 2019
     */
    private String articleCategories;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.article_tags
     *
     * @mbg.generated Fri Aug 16 15:25:34 CST 2019
     */
    private String articleTags;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.article_type
     *
     * @mbg.generated Fri Aug 16 15:25:34 CST 2019
     */
    private String articleType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.publish_date
     *
     * @mbg.generated Fri Aug 16 15:25:34 CST 2019
     */
    private Long publishDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.update_date
     *
     * @mbg.generated Fri Aug 16 15:25:34 CST 2019
     */
    private Long updateDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.article_tabloid
     *
     * @mbg.generated Fri Aug 16 15:25:34 CST 2019
     */
    private String articleTabloid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.comments
     *
     * @mbg.generated Fri Aug 16 15:25:34 CST 2019
     */
    private Integer comments;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.likes
     *
     * @mbg.generated Fri Aug 16 15:25:34 CST 2019
     */
    private Integer likes;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.id
     *
     * @return the value of article.id
     *
     * @mbg.generated Fri Aug 16 15:25:34 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.id
     *
     * @param id the value for article.id
     *
     * @mbg.generated Fri Aug 16 15:25:34 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.author
     *
     * @return the value of article.author
     *
     * @mbg.generated Fri Aug 16 15:25:34 CST 2019
     */
    public String getAuthor() {
        return author;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.author
     *
     * @param author the value for article.author
     *
     * @mbg.generated Fri Aug 16 15:25:34 CST 2019
     */
    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.article_title
     *
     * @return the value of article.article_title
     *
     * @mbg.generated Fri Aug 16 15:25:34 CST 2019
     */
    public String getArticleTitle() {
        return articleTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.article_title
     *
     * @param articleTitle the value for article.article_title
     *
     * @mbg.generated Fri Aug 16 15:25:34 CST 2019
     */
    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle == null ? null : articleTitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.article_content
     *
     * @return the value of article.article_content
     *
     * @mbg.generated Fri Aug 16 15:25:34 CST 2019
     */
    public String getArticleContent() {
        return articleContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.article_content
     *
     * @param articleContent the value for article.article_content
     *
     * @mbg.generated Fri Aug 16 15:25:34 CST 2019
     */
    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent == null ? null : articleContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.article_categories
     *
     * @return the value of article.article_categories
     *
     * @mbg.generated Fri Aug 16 15:25:34 CST 2019
     */
    public String getArticleCategories() {
        return articleCategories;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.article_categories
     *
     * @param articleCategories the value for article.article_categories
     *
     * @mbg.generated Fri Aug 16 15:25:34 CST 2019
     */
    public void setArticleCategories(String articleCategories) {
        this.articleCategories = articleCategories == null ? null : articleCategories.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.article_tags
     *
     * @return the value of article.article_tags
     *
     * @mbg.generated Fri Aug 16 15:25:34 CST 2019
     */
    public String getArticleTags() {
        return articleTags;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.article_tags
     *
     * @param articleTags the value for article.article_tags
     *
     * @mbg.generated Fri Aug 16 15:25:34 CST 2019
     */
    public void setArticleTags(String articleTags) {
        this.articleTags = articleTags == null ? null : articleTags.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.article_type
     *
     * @return the value of article.article_type
     *
     * @mbg.generated Fri Aug 16 15:25:34 CST 2019
     */
    public String getArticleType() {
        return articleType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.article_type
     *
     * @param articleType the value for article.article_type
     *
     * @mbg.generated Fri Aug 16 15:25:34 CST 2019
     */
    public void setArticleType(String articleType) {
        this.articleType = articleType == null ? null : articleType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.publish_date
     *
     * @return the value of article.publish_date
     *
     * @mbg.generated Fri Aug 16 15:25:34 CST 2019
     */
    public Long getPublishDate() {
        return publishDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.publish_date
     *
     * @param publishDate the value for article.publish_date
     *
     * @mbg.generated Fri Aug 16 15:25:34 CST 2019
     */
    public void setPublishDate(Long publishDate) {
        this.publishDate = publishDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.update_date
     *
     * @return the value of article.update_date
     *
     * @mbg.generated Fri Aug 16 15:25:34 CST 2019
     */
    public Long getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.update_date
     *
     * @param updateDate the value for article.update_date
     *
     * @mbg.generated Fri Aug 16 15:25:34 CST 2019
     */
    public void setUpdateDate(Long updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.article_tabloid
     *
     * @return the value of article.article_tabloid
     *
     * @mbg.generated Fri Aug 16 15:25:34 CST 2019
     */
    public String getArticleTabloid() {
        return articleTabloid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.article_tabloid
     *
     * @param articleTabloid the value for article.article_tabloid
     *
     * @mbg.generated Fri Aug 16 15:25:34 CST 2019
     */
    public void setArticleTabloid(String articleTabloid) {
        this.articleTabloid = articleTabloid == null ? null : articleTabloid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.comments
     *
     * @return the value of article.comments
     *
     * @mbg.generated Fri Aug 16 15:25:34 CST 2019
     */
    public Integer getComments() {
        return comments;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.comments
     *
     * @param comments the value for article.comments
     *
     * @mbg.generated Fri Aug 16 15:25:34 CST 2019
     */
    public void setComments(Integer comments) {
        this.comments = comments;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.likes
     *
     * @return the value of article.likes
     *
     * @mbg.generated Fri Aug 16 15:25:34 CST 2019
     */
    public Integer getLikes() {
        return likes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.likes
     *
     * @param likes the value for article.likes
     *
     * @mbg.generated Fri Aug 16 15:25:34 CST 2019
     */
    public void setLikes(Integer likes) {
        this.likes = likes;
    }
}