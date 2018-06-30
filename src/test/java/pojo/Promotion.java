package pojo;
import java.util.HashMap;
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
/**
 * Created by bjorn on 30/06/18.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Id",
        "Name",
        "Description",
        "Price",
        "MinimumPhotoCount",
        "OriginalPrice",
        "Recommended"
})
public class Promotion {

    @JsonProperty("Id")
    private Integer id;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Description")
    private String description;
    @JsonProperty("Price")
    private Double price;
    @JsonProperty("MinimumPhotoCount")
    private Integer minimumPhotoCount;
    @JsonProperty("OriginalPrice")
    private Double originalPrice;
    @JsonProperty("Recommended")
    private Boolean recommended;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("Id")
    public void setId(Integer id) {
        this.id = id;
    }

    public Promotion withId(Integer id) {
        this.id = id;
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

    public Promotion withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("Description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("Description")
    public void setDescription(String description) {
        this.description = description;
    }

    public Promotion withDescription(String description) {
        this.description = description;
        return this;
    }

    @JsonProperty("Price")
    public Double getPrice() {
        return price;
    }

    @JsonProperty("Price")
    public void setPrice(Double price) {
        this.price = price;
    }

    public Promotion withPrice(Double price) {
        this.price = price;
        return this;
    }

    @JsonProperty("MinimumPhotoCount")
    public Integer getMinimumPhotoCount() {
        return minimumPhotoCount;
    }

    @JsonProperty("MinimumPhotoCount")
    public void setMinimumPhotoCount(Integer minimumPhotoCount) {
        this.minimumPhotoCount = minimumPhotoCount;
    }

    public Promotion withMinimumPhotoCount(Integer minimumPhotoCount) {
        this.minimumPhotoCount = minimumPhotoCount;
        return this;
    }

    @JsonProperty("OriginalPrice")
    public Double getOriginalPrice() {
        return originalPrice;
    }

    @JsonProperty("OriginalPrice")
    public void setOriginalPrice(Double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public Promotion withOriginalPrice(Double originalPrice) {
        this.originalPrice = originalPrice;
        return this;
    }

    @JsonProperty("Recommended")
    public Boolean getRecommended() {
        return recommended;
    }

    @JsonProperty("Recommended")
    public void setRecommended(Boolean recommended) {
        this.recommended = recommended;
    }

    public Promotion withRecommended(Boolean recommended) {
        this.recommended = recommended;
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

    public Promotion withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(id).append(name).append(description).append(price).append(minimumPhotoCount).append(originalPrice).append(recommended).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Promotion) == false) {
            return false;
        }
        Promotion rhs = ((Promotion) other);
        return new EqualsBuilder().append(id, rhs.id).append(name, rhs.name).append(description, rhs.description).append(price, rhs.price).append(minimumPhotoCount, rhs.minimumPhotoCount).append(originalPrice, rhs.originalPrice).append(recommended, rhs.recommended).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
