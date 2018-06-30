package pojo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "CategoryId",
        "Name",
        "Path",
        "CanListAuctions",
        "CanListClassifieds",
        "CanRelist",
        "LegalNotice",
        "DefaultDuration",
        "AllowedDurations",
        "Fees",
        "FreePhotoCount",
        "MaximumPhotoCount",
        "IsFreeToRelist",
        "Promotions",
        "EmbeddedContentOptions",
        "MaximumTitleLength",
        "AreaOfBusiness",
        "DefaultRelistDuration"
})
/**
 * Created by bjorn on 30/06/18.
 */
public class Category {

    @JsonProperty("CategoryId")
    private Integer categoryId;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Path")
    private String path;
    @JsonProperty("CanListAuctions")
    private Boolean canListAuctions;
    @JsonProperty("CanListClassifieds")
    private Boolean canListClassifieds;
    @JsonProperty("CanRelist")
    private Boolean canRelist;
    @JsonProperty("LegalNotice")
    private String legalNotice;
    @JsonProperty("DefaultDuration")
    private Integer defaultDuration;
    @JsonProperty("AllowedDurations")
    private List<Integer> allowedDurations = new ArrayList<Integer>();
    @JsonProperty("Fees")
    private Fees fees;
    @JsonProperty("FreePhotoCount")
    private Integer freePhotoCount;
    @JsonProperty("MaximumPhotoCount")
    private Integer maximumPhotoCount;
    @JsonProperty("IsFreeToRelist")
    private Boolean isFreeToRelist;
    @JsonProperty("Promotions")
    private List<Promotion> promotions = new ArrayList<Promotion>();
    @JsonProperty("EmbeddedContentOptions")
    private List<Object> embeddedContentOptions = new ArrayList<Object>();
    @JsonProperty("MaximumTitleLength")
    private Integer maximumTitleLength;
    @JsonProperty("AreaOfBusiness")
    private Integer areaOfBusiness;
    @JsonProperty("DefaultRelistDuration")
    private Integer defaultRelistDuration;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("CategoryId")
    public Integer getCategoryId() {
        return categoryId;
    }

    @JsonProperty("CategoryId")
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Category withCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    public Category withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("Path")
    public String getPath() {
        return path;
    }

    @JsonProperty("Path")
    public void setPath(String path) {
        this.path = path;
    }

    public Category withPath(String path) {
        this.path = path;
        return this;
    }

    @JsonProperty("CanListAuctions")
    public Boolean getCanListAuctions() {
        return canListAuctions;
    }

    @JsonProperty("CanListAuctions")
    public void setCanListAuctions(Boolean canListAuctions) {
        this.canListAuctions = canListAuctions;
    }

    public Category withCanListAuctions(Boolean canListAuctions) {
        this.canListAuctions = canListAuctions;
        return this;
    }

    @JsonProperty("CanListClassifieds")
    public Boolean getCanListClassifieds() {
        return canListClassifieds;
    }

    @JsonProperty("CanListClassifieds")
    public void setCanListClassifieds(Boolean canListClassifieds) {
        this.canListClassifieds = canListClassifieds;
    }

    public Category withCanListClassifieds(Boolean canListClassifieds) {
        this.canListClassifieds = canListClassifieds;
        return this;
    }

    @JsonProperty("CanRelist")
    public Boolean getCanRelist() {
        return canRelist;
    }

    @JsonProperty("CanRelist")
    public void setCanRelist(Boolean canRelist) {
        this.canRelist = canRelist;
    }

    public Category withCanRelist(Boolean canRelist) {
        this.canRelist = canRelist;
        return this;
    }

    @JsonProperty("LegalNotice")
    public String getLegalNotice() {
        return legalNotice;
    }

    @JsonProperty("LegalNotice")
    public void setLegalNotice(String legalNotice) {
        this.legalNotice = legalNotice;
    }

    public Category withLegalNotice(String legalNotice) {
        this.legalNotice = legalNotice;
        return this;
    }

    @JsonProperty("DefaultDuration")
    public Integer getDefaultDuration() {
        return defaultDuration;
    }

    @JsonProperty("DefaultDuration")
    public void setDefaultDuration(Integer defaultDuration) {
        this.defaultDuration = defaultDuration;
    }

    public Category withDefaultDuration(Integer defaultDuration) {
        this.defaultDuration = defaultDuration;
        return this;
    }

    @JsonProperty("AllowedDurations")
    public List<Integer> getAllowedDurations() {
        return allowedDurations;
    }

    @JsonProperty("AllowedDurations")
    public void setAllowedDurations(List<Integer> allowedDurations) {
        this.allowedDurations = allowedDurations;
    }

    public Category withAllowedDurations(List<Integer> allowedDurations) {
        this.allowedDurations = allowedDurations;
        return this;
    }

    @JsonProperty("Fees")
    public Fees getFees() {
        return fees;
    }

    @JsonProperty("Fees")
    public void setFees(Fees fees) {
        this.fees = fees;
    }

    public Category withFees(Fees fees) {
        this.fees = fees;
        return this;
    }

    @JsonProperty("FreePhotoCount")
    public Integer getFreePhotoCount() {
        return freePhotoCount;
    }

    @JsonProperty("FreePhotoCount")
    public void setFreePhotoCount(Integer freePhotoCount) {
        this.freePhotoCount = freePhotoCount;
    }

    public Category withFreePhotoCount(Integer freePhotoCount) {
        this.freePhotoCount = freePhotoCount;
        return this;
    }

    @JsonProperty("MaximumPhotoCount")
    public Integer getMaximumPhotoCount() {
        return maximumPhotoCount;
    }

    @JsonProperty("MaximumPhotoCount")
    public void setMaximumPhotoCount(Integer maximumPhotoCount) {
        this.maximumPhotoCount = maximumPhotoCount;
    }

    public Category withMaximumPhotoCount(Integer maximumPhotoCount) {
        this.maximumPhotoCount = maximumPhotoCount;
        return this;
    }

    @JsonProperty("IsFreeToRelist")
    public Boolean getIsFreeToRelist() {
        return isFreeToRelist;
    }

    @JsonProperty("IsFreeToRelist")
    public void setIsFreeToRelist(Boolean isFreeToRelist) {
        this.isFreeToRelist = isFreeToRelist;
    }

    public Category withIsFreeToRelist(Boolean isFreeToRelist) {
        this.isFreeToRelist = isFreeToRelist;
        return this;
    }

    @JsonProperty("Promotions")
    public List<Promotion> getPromotions() {
        return promotions;
    }

    @JsonProperty("Promotions")
    public void setPromotions(List<Promotion> promotions) {
        this.promotions = promotions;
    }

    public Category withPromotions(List<Promotion> promotions) {
        this.promotions = promotions;
        return this;
    }

    @JsonProperty("EmbeddedContentOptions")
    public List<Object> getEmbeddedContentOptions() {
        return embeddedContentOptions;
    }

    @JsonProperty("EmbeddedContentOptions")
    public void setEmbeddedContentOptions(List<Object> embeddedContentOptions) {
        this.embeddedContentOptions = embeddedContentOptions;
    }

    public Category withEmbeddedContentOptions(List<Object> embeddedContentOptions) {
        this.embeddedContentOptions = embeddedContentOptions;
        return this;
    }

    @JsonProperty("MaximumTitleLength")
    public Integer getMaximumTitleLength() {
        return maximumTitleLength;
    }

    @JsonProperty("MaximumTitleLength")
    public void setMaximumTitleLength(Integer maximumTitleLength) {
        this.maximumTitleLength = maximumTitleLength;
    }

    public Category withMaximumTitleLength(Integer maximumTitleLength) {
        this.maximumTitleLength = maximumTitleLength;
        return this;
    }

    @JsonProperty("AreaOfBusiness")
    public Integer getAreaOfBusiness() {
        return areaOfBusiness;
    }

    @JsonProperty("AreaOfBusiness")
    public void setAreaOfBusiness(Integer areaOfBusiness) {
        this.areaOfBusiness = areaOfBusiness;
    }

    public Category withAreaOfBusiness(Integer areaOfBusiness) {
        this.areaOfBusiness = areaOfBusiness;
        return this;
    }

    @JsonProperty("DefaultRelistDuration")
    public Integer getDefaultRelistDuration() {
        return defaultRelistDuration;
    }

    @JsonProperty("DefaultRelistDuration")
    public void setDefaultRelistDuration(Integer defaultRelistDuration) {
        this.defaultRelistDuration = defaultRelistDuration;
    }

    public Category withDefaultRelistDuration(Integer defaultRelistDuration) {
        this.defaultRelistDuration = defaultRelistDuration;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Category withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(categoryId).append(name).append(path).append(canListAuctions).append(canListClassifieds).append(canRelist).append(legalNotice).append(defaultDuration).append(allowedDurations).append(fees).append(freePhotoCount).append(maximumPhotoCount).append(isFreeToRelist).append(promotions).append(embeddedContentOptions).append(maximumTitleLength).append(areaOfBusiness).append(defaultRelistDuration).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Category) == false) {
            return false;
        }
        Category rhs = ((Category) other);
        return new EqualsBuilder().append(categoryId, rhs.categoryId).append(name, rhs.name).append(path, rhs.path).append(canListAuctions, rhs.canListAuctions).append(canListClassifieds, rhs.canListClassifieds).append(canRelist, rhs.canRelist).append(legalNotice, rhs.legalNotice).append(defaultDuration, rhs.defaultDuration).append(allowedDurations, rhs.allowedDurations).append(fees, rhs.fees).append(freePhotoCount, rhs.freePhotoCount).append(maximumPhotoCount, rhs.maximumPhotoCount).append(isFreeToRelist, rhs.isFreeToRelist).append(promotions, rhs.promotions).append(embeddedContentOptions, rhs.embeddedContentOptions).append(maximumTitleLength, rhs.maximumTitleLength).append(areaOfBusiness, rhs.areaOfBusiness).append(defaultRelistDuration, rhs.defaultRelistDuration).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

