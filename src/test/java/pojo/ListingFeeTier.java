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
        "MinimumTierPrice",
        "FixedFee"
})
public class ListingFeeTier {
    @JsonProperty("MinimumTierPrice")
    private Integer minimumTierPrice;
    @JsonProperty("FixedFee")
    private Double fixedFee;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("MinimumTierPrice")
    public Integer getMinimumTierPrice() {
        return minimumTierPrice;
    }

    @JsonProperty("MinimumTierPrice")
    public void setMinimumTierPrice(Integer minimumTierPrice) {
        this.minimumTierPrice = minimumTierPrice;
    }

    public ListingFeeTier withMinimumTierPrice(Integer minimumTierPrice) {
        this.minimumTierPrice = minimumTierPrice;
        return this;
    }

    @JsonProperty("FixedFee")
    public Double getFixedFee() {
        return fixedFee;
    }

    @JsonProperty("FixedFee")
    public void setFixedFee(Double fixedFee) {
        this.fixedFee = fixedFee;
    }

    public ListingFeeTier withFixedFee(Double fixedFee) {
        this.fixedFee = fixedFee;
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

    public ListingFeeTier withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(minimumTierPrice).append(fixedFee).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ListingFeeTier) == false) {
            return false;
        }
        ListingFeeTier rhs = ((ListingFeeTier) other);
        return new EqualsBuilder().append(minimumTierPrice, rhs.minimumTierPrice).append(fixedFee, rhs.fixedFee).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

