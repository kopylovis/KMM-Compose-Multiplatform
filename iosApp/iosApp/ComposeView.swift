//
//  ComposeView.swift
//  iosApp
//
//  Created by Ivan Kopylov on 25.07.2023.
//  Copyright © 2023 orgName. All rights reserved.
//

import Foundation
import shared
import SwiftUI

struct ComposeView: UIViewControllerRepresentable {
    func updateUIViewController(_ uiViewController: UIViewControllerType, context: Context) {}
    func makeUIViewController(context: Context) -> some UIViewController {
        MainViewControllerKt.mainViewController()
    }
}
