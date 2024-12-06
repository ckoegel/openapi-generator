//
// Tag.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation

@available(*, deprecated, renamed: "PetstoreClientAPI.Tag")
public typealias Tag = PetstoreClientAPI.Tag

extension PetstoreClientAPI {

public final class Tag: @unchecked Sendable, Codable, JSONEncodable, Hashable {

    public private(set) var id: Int64?
    public private(set) var name: String?

    public init(id: Int64? = nil, name: String? = nil) {
        self.id = id
        self.name = name
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case id
        case name
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(id, forKey: .id)
        try container.encodeIfPresent(name, forKey: .name)
    }

    public static func == (lhs: Tag, rhs: Tag) -> Bool {
        lhs.id == rhs.id &&
        lhs.name == rhs.name
        
    }

    public func hash(into hasher: inout Hasher) {
        hasher.combine(id?.hashValue)
        hasher.combine(name?.hashValue)
        
    }
}

}

@available(iOS 13, tvOS 13, watchOS 6, macOS 10.15, *)
extension PetstoreClientAPI.Tag: Identifiable {}
