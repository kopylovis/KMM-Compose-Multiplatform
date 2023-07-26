//
//  AppDelegate.swift
//  iosApp
//
//  Created by Ivan Kopylov on 26.07.2023.
//  Copyright © 2023 orgName. All rights reserved.
//

import Foundation
import SwiftUI
import UIKit
import shared

class AppDelegate: NSObject, UIApplicationDelegate {
    func application(_ application: UIApplication, didFinishLaunchingWithOptions launchOptions: [UIApplication.LaunchOptionsKey : Any]? = nil) -> Bool {
        KoinIOSKt.doInitKoinIos()
        return true
    }
}
