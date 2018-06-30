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

/**
 * Created by bjorn on 30/06/18.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Bundle",
        "EndDate",
        "Feature",
        "Gallery",
        "Listing",
        "Reserve",
        "Subtitle",
        "TenDays",
        "ListingFeeTiers",
        "SecondCategory"
})
public class Fees {
    @JsonProperty("Bundle")
    private Double bundle;
    @JsonProperty("EndDate")
    private Double endDate;
    @JsonProperty("Feature")
    private Double feature;
    @JsonProperty("Gallery")
    private Double gallery;
    @JsonProperty("Listing")
    private Double listing;
    @JsonProperty("Reserve")
    private Double reserve;
    @JsonProperty("Subtitle")
    private Double subtitle;
    @JsonProperty("TenDays")
    private Double tenDays;
    @JsonProperty("ListingFeeTiers")
    private List<ListingFeeTier> listingFeeTiers = new ArrayList<ListingFeeTier>();
    @JsonProperty("SecondCategory")
    private Double secondCategory;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Bundle")
    public Double getBundle() {
        return bundle;
    }

    @JsonProperty("Bundle")
    public void setBundle(Double bundle) {
        this.bundle = bundle;
    }

    public Fees withBundle(Double bundle) {
        this.bundle = bundle;
        return this;
    }

    @JsonProperty("EndDate")
    public Double getEndDate() {
        return endDate;
    }

    @JsonProperty("EndDate")
    public void setEndDate(Double endDate) {
        this.endDate = endDate;
    }

    public Fees withEndDate(Double endDate) {
        this.endDate = endDate;
        return this;
    }

    @JsonProperty("Feature")
    public Double getFeature() {
        return feature;
    }

    @JsonProperty("Feature")
    public void setFeature(Double feature) {
        this.feature = feature;
    }

    public Fees withFeature(Double feature) {
        this.feature = feature;
        return this;
    }

    @JsonProperty("Gallery")
    public Double getGallery() {
        return gallery;
    }

    @JsonProperty("Gallery")
    public void setGallery(Double gallery) {
        this.gallery = gallery;
    }

    public Fees withGallery(Double gallery) {
        this.gallery = gallery;
        return this;
    }

    @JsonProperty("Listing")
    public Double getListing() {
        return listing;
    }

    @JsonProperty("Listing")
    public void setListing(Double listing) {
        this.listing = listing;
    }

    public Fees withListing(Double listing) {
        this.listing = listing;
        return this;
    }

    @JsonProperty("Reserve")
    public Double getReserve() {
        return reserve;
    }

    @JsonProperty("Reserve")
    public void setReserve(Double reserve) {
        this.reserve = reserve;
    }

    public Fees withReserve(Double reserve) {
        this.reserve = reserve;
        return this;
    }

    @JsonProperty("Subtitle")
    public Double getSubtitle() {
        return subtitle;
    }

    @JsonProperty("Subtitle")
    public void setSubtitle(Double subtitle) {
        this.subtitle = subtitle;
    }

    public Fees withSubtitle(Double subtitle) {
        this.subtitle = subtitle;
        return this;
    }

    @JsonProperty("TenDays")
    public Double getTenDays() {
        return tenDays;
    }

    @JsonProperty("TenDays")
    public void setTenDays(Double tenDays) {
        this.tenDays = tenDays;
    }

    public Fees withTenDays(Double tenDays) {
        this.tenDays = tenDays;
        return this;
    }

    @JsonProperty("ListingFeeTiers")
    public List<ListingFeeTier> getListingFeeTiers() {
        return listingFeeTiers;
    }

    @JsonProperty("ListingFeeTiers")
    public void setListingFeeTiers(List<ListingFeeTier> listingFeeTiers) {
        this.listingFeeTiers = listingFeeTiers;
    }

    public Fees withListingFeeTiers(List<ListingFeeTier> listingFeeTiers) {
        this.listingFeeTiers = listingFeeTiers;
        return this;
    }

    @JsonProperty("SecondCategory")
    public Double getSecondCategory() {
        return secondCategory;
    }

    @JsonProperty("SecondCategory")
    public void setSecondCategory(Double secondCategory) {
        this.secondCategory = secondCategory;
    }

    public Fees withSecondCategory(Double secondCategory) {
        this.secondCategory = secondCategory;
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

    public Fees withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(bundle).append(endDate).append(feature).append(gallery).append(listing).append(reserve).append(subtitle).append(tenDays).append(listingFeeTiers).append(secondCategory).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Fees) == false) {
            return false;
        }
        Fees rhs = ((Fees) other);
        return new EqualsBuilder().append(bundle, rhs.bundle).append(endDate, rhs.endDate).append(feature, rhs.feature).append(gallery, rhs.gallery).append(listing, rhs.listing).append(reserve, rhs.reserve).append(subtitle, rhs.subtitle).append(tenDays, rhs.tenDays).append(listingFeeTiers, rhs.listingFeeTiers).append(secondCategory, rhs.secondCategory).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

