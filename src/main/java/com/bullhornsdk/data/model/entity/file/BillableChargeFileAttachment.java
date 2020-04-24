package com.bullhornsdk.data.model.entity.file;

import com.bullhornsdk.data.model.entity.core.paybill.charge.BillableCharge;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.Objects;

/**
 * Created by mkesmetzis 22-Apr-20
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({
    "id",
    "billableCharge",
    "contentSubType",
    "contentType",
    "dateAdded",
    "departmentsSharedWith",
    "description",
    "directory",
    "distribution",
    "externalID",
    "fileExtension",
    "fileOwner",
    "fileSize",
    "fileType",
    "isCopied",
    "isDeleted",
    "isEncrypted",
    "isExternal",
    "isOpen",
    "isPrivate",
    "isSendOut",
    "name",
    "type",
    "usersSharedWith"
})
public class BillableChargeFileAttachment extends EntityFileAttachment {

    private BillableCharge billableCharge;

    @JsonProperty("billableCharge")
    public BillableCharge getBillableCharge() {
        return billableCharge;
    }

    @JsonProperty("billableCharge")
    public void setBillableCharge(BillableCharge billableCharge) {
        this.billableCharge = billableCharge;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BillableChargeFileAttachment that = (BillableChargeFileAttachment) o;
        return Objects.equals(billableCharge, that.billableCharge);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), billableCharge);
    }
}
