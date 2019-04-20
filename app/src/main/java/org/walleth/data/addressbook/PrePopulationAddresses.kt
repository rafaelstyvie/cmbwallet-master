package org.walleth.data.addressbook

import org.kethereum.model.Address


val rafael = AddressBookEntry(
        name = "Rafael Ribeiro",
        address = Address("0xD0679ed045DF4bD88b9AfD688bcc53f02E1871f4"),
        note = "Dev & CEO ",
        isNotificationWanted = false,
        trezorDerivationPath = null
)

val dourado = AddressBookEntry(
        name = "Andre Dourado",
        address = Address("0xD0679ed045DF4bD88b9AfD688bcc53f02E1871f4"),
        note = "Dev & CTO  ",
        isNotificationWanted = false,
        trezorDerivationPath = null
)

val faucet = AddressBookEntry(
        name = "Faucet",
        address = Address("0x31b98d14007bdee637298086988a0bbd31184523"),
        note = "The source of some rinkeby ether",
        isNotificationWanted = false,
        trezorDerivationPath = null
)

val allPrePopulationAddresses = listOf(rafael, dourado, faucet)