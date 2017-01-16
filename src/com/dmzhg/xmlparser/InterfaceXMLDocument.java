package com.dmzhg.xmlparser;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Represents root element of every import xml
 *
 * @author dmzhg
 */
public class InterfaceXMLDocument {

    private String description;
    private BigDecimal version;
    private LocalDateTime creationDate;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getVersion() {
        return version;
    }

    public void setVersion(BigDecimal version) {
        this.version = version;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }
}
