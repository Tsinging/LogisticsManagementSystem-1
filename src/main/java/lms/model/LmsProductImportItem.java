package lms.model;

import java.math.BigDecimal;

public class LmsProductImportItem {
    private BigDecimal id;

    private BigDecimal expectCount;

    private BigDecimal factCount;

    private String description;

    private BigDecimal lmsProductId;

    private BigDecimal lmsProductImportId;

    private String lmsProductImportItemcol;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getExpectCount() {
        return expectCount;
    }

    public void setExpectCount(BigDecimal expectCount) {
        this.expectCount = expectCount;
    }

    public BigDecimal getFactCount() {
        return factCount;
    }

    public void setFactCount(BigDecimal factCount) {
        this.factCount = factCount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public BigDecimal getLmsProductId() {
        return lmsProductId;
    }

    public void setLmsProductId(BigDecimal lmsProductId) {
        this.lmsProductId = lmsProductId;
    }

    public BigDecimal getLmsProductImportId() {
        return lmsProductImportId;
    }

    public void setLmsProductImportId(BigDecimal lmsProductImportId) {
        this.lmsProductImportId = lmsProductImportId;
    }

    public String getLmsProductImportItemcol() {
        return lmsProductImportItemcol;
    }

    public void setLmsProductImportItemcol(String lmsProductImportItemcol) {
        this.lmsProductImportItemcol = lmsProductImportItemcol == null ? null : lmsProductImportItemcol.trim();
    }
}