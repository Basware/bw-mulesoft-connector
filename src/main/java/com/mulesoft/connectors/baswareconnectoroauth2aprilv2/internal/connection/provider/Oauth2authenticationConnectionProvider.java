package com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.connection.provider;

import com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.connection.provider.refinement.Oauth2authenticationConnectionProviderRefinement;
import org.mule.runtime.extension.api.annotation.Alias;
import org.mule.runtime.extension.api.annotation.connectivity.oauth.ClientCredentials;
import org.mule.runtime.extension.api.annotation.param.display.DisplayName;

/**
 * This is the last layer of the connection provider generation gap pattern. It is what finally gets
 * exposed as the connection provider, including all customizations made in the refinement layer.
 */
@Alias("oauth2authentication")
@DisplayName("Oauth2authentication Connection Provider")
@ClientCredentials(
    tokenUrl = "https://api.basware.com/v1/tokens",
    defaultScopes =
        "accountingDocuments.read accountingDocuments.write accountingDocuments.delete accounts.read accounts.write accounts.delete advancedPermissions.read advancedPermissions.write advancedPermissions.delete advancedValidations.read advancedValidations.write advancedValidations.delete applicationGroups.read applicationGroups.write companies.read companies.write contracts.delete contracts.read contracts.write costCenters.read costCenters.write costCenters.delete errorFeedbacks.read errorFeedbacks.write errorFeedbacks.delete exchangeRates.read exchangeRates.write exchangeRates.delete exportedContracts.read exportedContracts.write exportedContracts.delete exportedContractSpends.read exportedContractSpends.write exportedContractSpends.delete exportedPurchaseOrders.read exportedPurchaseOrders.write exportedPurchaseOrders.delete exportedPurchaseRequisitions.read exportedPurchaseRequisitions.write exportedPurchaseRequisitions.delete lists.read lists.write lists.delete matchingOrders.read matchingOrders.write matchingOrders.delete matchingOrderLines.read matchingOrderLines.write matchingOrderLines.delete paymentTerms.read paymentTerms.write paymentTerms.delete projects.read projects.write projects.delete purchaseOrders.read purchaseOrders.write purchaseOrders.delete purchaseRequisitions.read purchaseRequisitions.write purchaseRequisitions.delete purchaseGoodsReceipts.read purchaseGoodsReceipts.write purchaseGoodsReceipts.delete requestStatus.read requestStatus.write subscriptions.read subscriptions.write subscriptions.delete tasks.read taskStatus.read taxCodes.read taxCodes.write taxCodes.delete users.read users.write users.delete vendors.read vendors.write vendors.delete")
public class Oauth2authenticationConnectionProvider
    extends Oauth2authenticationConnectionProviderRefinement {}
