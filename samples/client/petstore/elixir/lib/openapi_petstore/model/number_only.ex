# NOTE: This file is auto generated by OpenAPI Generator 7.11.0-SNAPSHOT (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule OpenapiPetstore.Model.NumberOnly do
  @moduledoc """
  
  """

  @derive Jason.Encoder
  defstruct [
    :JustNumber
  ]

  @type t :: %__MODULE__{
    :JustNumber => float() | nil
  }

  def decode(value) do
    value
  end
end

